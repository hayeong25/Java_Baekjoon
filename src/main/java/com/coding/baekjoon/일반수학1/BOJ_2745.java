package com.coding.baekjoon.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        String n = tokenizer.nextToken();
        int b = Integer.parseInt(tokenizer.nextToken());

        int pow = 0;
        int result = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            int ascii;

            char c = n.charAt(i);

            if ('A' <= c && c <= 'Z') {
                ascii = c - 55;
            } else {
                ascii = c - 48;
            }

            result += (int) (ascii * Math.pow(b, pow));

            pow++;
        }

        System.out.println(result);
    }
}