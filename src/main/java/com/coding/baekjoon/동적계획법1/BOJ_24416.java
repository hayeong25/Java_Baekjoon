package com.coding.baekjoon.동적계획법1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_24416 {
    static int count1 = 0;
    static int count2 = 0;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        arr = new int[n];

        fib(n);
        fibonacci(n);

        System.out.println(count1 + " " + count2);
    }

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            count1++;
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    private static int fibonacci(int n) {
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            count2++;
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n - 1];
    }
}