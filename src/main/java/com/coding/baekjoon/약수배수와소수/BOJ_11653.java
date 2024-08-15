package com.coding.baekjoon.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
    }
}