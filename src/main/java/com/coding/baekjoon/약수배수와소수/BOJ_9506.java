package com.coding.baekjoon.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n;

        while ((n = Integer.parseInt(reader.readLine())) != -1) {
            List<Integer> divisorList = new ArrayList<>();

            int sum = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    divisorList.add(i);
                    sum += i;
                }
            }

            Collections.sort(divisorList);

            if (n == sum) {
                System.out.print(n + " = 1");

                for (int i = 1; i < divisorList.size(); i++) {
                    System.out.print(" + " + divisorList.get(i));
                }

                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}