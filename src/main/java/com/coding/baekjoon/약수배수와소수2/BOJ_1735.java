package com.coding.baekjoon.약수배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(reader.readLine(), " ");

        int c = Integer.parseInt(tokenizer.nextToken());
        int d = Integer.parseInt(tokenizer.nextToken());

        int denominator = b * d;
        int numerator = (a * d) + (c * b);

        int gcd = 1;

        for (int i = 1; i <= Math.min(denominator, numerator); i++) {
            if (denominator % i == 0 && numerator % i == 0) {
                gcd = i;
            }
        }

        System.out.println((numerator / gcd) + " " + (denominator / gcd));
    }
}