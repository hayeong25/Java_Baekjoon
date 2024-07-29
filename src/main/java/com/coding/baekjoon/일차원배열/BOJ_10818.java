package com.coding.baekjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(reader.readLine());

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int min = 0;
        int max = 0;

        for (int i = 0; i < length; i++) {
            int a = Integer.parseInt(tokenizer.nextToken());

            if (i == 0) {
                min = a;
                max = a;
                continue;
            }

            if (a < min) {
                min = a;
            } else if (a > max) {
                max = a;
            }
        }

        System.out.println(min + " " + max);
    }
}