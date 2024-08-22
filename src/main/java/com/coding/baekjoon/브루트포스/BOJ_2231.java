package com.coding.baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        System.out.println(checkSum(n));
    }

    private static int checkSum(int n) {
        for (int i = 1; i < n; i++) {
            int sum = i;

            String str = String.valueOf(i);

            for (int j = 0; j < str.length(); j++) {
                sum += (int)str.charAt(j) - 48;
            }

            if (sum == n) {
                return i;
            }
        }

        return 0;
    }
}