package com.coding.baekjoon.백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class BOJ_15652 {
    public static int[] arr;
    public static int N, M;
    public static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        N = Integer.parseInt(tokenizer.nextToken());
        M = Integer.parseInt(tokenizer.nextToken());

        arr = new int[M];

        dfs(1, 0);

        System.out.println(builder);
    }

    public static void dfs(int at, int depth) {
        if (depth == M) {
            for (int val : arr) {
                builder.append(val).append(" ");
            }
            builder.append("\n");
            return;
        }

        for (int i = at; i <= N; i++) {
            arr[depth] = i;
            dfs(i, depth + 1);
        }
    }
}