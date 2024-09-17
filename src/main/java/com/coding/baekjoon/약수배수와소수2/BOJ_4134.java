package com.coding.baekjoon.약수배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            long target = Long.parseLong(reader.readLine());

            if (target == 0 || target == 1) {
                System.out.println(2);
                continue;
            }

            while (true) {
                int count = 0;

                for (int j = 2; j <= Math.sqrt(target); j++) {
                    if (target % j == 0) {
                        count++;
                        break;
                    }
                }

                if (count == 0) {
                    System.out.println(target);
                    break;
                }

                target++;
            }
        }
    }
}