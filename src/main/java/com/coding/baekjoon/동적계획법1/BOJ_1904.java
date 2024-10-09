package com.coding.baekjoon.동적계획법1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_1904 {
    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        arr = new long[n + 1];

        arr[0] = 1;
        arr[1] = 2;

        System.out.println(func(n));
    }

    private static long func(int n) {
        if (arr[n - 1] == 0) {
            arr[n - 1] = (func(n - 2) + func(n - 1)) % 15746;
        }

        return arr[n - 1];
    }
}