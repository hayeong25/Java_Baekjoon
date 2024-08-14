package com.coding.baekjoon.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        reader.readLine();

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int result = 0;

        while (tokenizer.hasMoreTokens()) {
            int n = Integer.parseInt(tokenizer.nextToken());

            int count = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                result++;
            }
        }

        System.out.println(result);
    }
}