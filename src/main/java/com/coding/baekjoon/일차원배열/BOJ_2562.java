package com.coding.baekjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int max = 0;

        for (int i = 1; i < 10; i++) {
            int n = Integer.parseInt(reader.readLine());

            if (max < n) {
                max = n;
                count = i;
            }
        }

        System.out.println(max);
        System.out.println(count);
    }
}