package com.coding.baekjoon.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(reader.readLine(), " ");

            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(reader.readLine(), " ");

            for (int j = 0; j < m; j++) {
                arr[i][j] += Integer.parseInt(tokenizer.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
