package com.coding.baekjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        StringBuilder builder = new StringBuilder();

        int length = Integer.parseInt(tokenizer.nextToken());
        int target = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(reader.readLine(), " ");

        for (int i = 0; i < length; i++) {
            int a = Integer.parseInt(tokenizer.nextToken());

            if (a < target) {
                builder.append(a).append(" ");
            }
        }

        System.out.println(builder);
    }
}