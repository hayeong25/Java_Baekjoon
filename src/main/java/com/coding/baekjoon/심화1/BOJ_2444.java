package com.coding.baekjoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i < 2 * n; i++) {
            if (i <= n) {
                for (int j = 1; j < 2 * n; j++) {
                    if (n - i >= j) {
                        System.out.print(" ");
                    } else if (n - i < j && j < n + i) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            } else {
                for (int j = 1; j < 2 * n; j++) {
                    if (i - n >= j) {
                        System.out.print(" ");
                    } else if (i - n < j && j < 3 * n - i) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}