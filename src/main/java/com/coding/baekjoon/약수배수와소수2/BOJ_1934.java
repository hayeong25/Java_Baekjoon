package com.coding.baekjoon.약수배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(reader.readLine());

        for (int i = 0; i < loop; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());

            int min = Math.min(a, b);
            int max = Math.max(a, b);

            for (int j = 1; j <= max; j++) {
                if ((min * j) % max == 0) {
                    System.out.println(min * j);
                    break;
                }
            }
        }
    }
}