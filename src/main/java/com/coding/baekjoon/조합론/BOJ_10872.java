package com.coding.baekjoon.조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        long factorial = 1;

        if (n == 0) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println(factorial);
        }
    }
}