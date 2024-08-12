package com.coding.baekjoon.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());

        while (n != 0) {
            int remain = n % b;

            if (10 <= remain) {
                builder.append((char)(remain + 55));
            } else {
                builder.append((char)(remain + 48));
            }

            n /= b;
        }

        System.out.println(builder.reverse());
    }
}