package com.coding.baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int count = -1;

        for (int i = 0; i <= n / 5; i++) {
            if ((n - (5 * i)) % 3 == 0) {
                count = i + ((n - (5 * i)) / 3);
            }
        }

        if (count == -1 && n % 3 == 0) {
            count /= 3;
        }

        System.out.println(count);
    }
}