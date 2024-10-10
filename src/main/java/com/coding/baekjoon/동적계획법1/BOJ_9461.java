package com.coding.baekjoon.동적계획법1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_9461 {
    static long[] arr = new long[100];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        arr[0] = arr[1] = arr[2] = 1;

        for (int i = 3; i < 100; i++) {
            init(i);
        }

        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(reader.readLine());
            builder.append(arr[n - 1]).append("\n");
        }

        System.out.println(builder);
    }

    private static void init(int n) {
        arr[n] = arr[n - 3] + arr[n - 2];
    }
}