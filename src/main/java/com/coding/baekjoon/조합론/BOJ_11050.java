package com.coding.baekjoon.조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
    분자 (numerator) = n!
    분모 (denominator) = (n - k)!k!
*/

public class BOJ_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        long numerator = 1;
        long denominator = 1;

        for (int i = 1; i <= n; i++) {
            numerator *= i;
        }

        for (int i = 1; i <= (n - k); i++) {
            denominator *= i;
        }

        if (k != 0) {
            for (int i = 1; i <= k; i++) {
                denominator *= i;
            }
        }

        System.out.println(numerator / denominator);
    }
}