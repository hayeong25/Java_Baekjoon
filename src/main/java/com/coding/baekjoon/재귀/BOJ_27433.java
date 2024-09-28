package com.coding.baekjoon.재귀;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        System.out.println(factorial(n));
    }

    private static long factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}