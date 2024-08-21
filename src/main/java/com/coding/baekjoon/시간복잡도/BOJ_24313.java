package com.coding.baekjoon.시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int a1 = Integer.parseInt(tokenizer.nextToken());
        int a0 = Integer.parseInt(tokenizer.nextToken());

        int c = Integer.parseInt(reader.readLine());

        int n = Integer.parseInt(reader.readLine());

        long f = (a1 * n) + a0;
        long g = c * n;

        System.out.println(f <= g && a1 <= c ? 1 : 0);
    }
}