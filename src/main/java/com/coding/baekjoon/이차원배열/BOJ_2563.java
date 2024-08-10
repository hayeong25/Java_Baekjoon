package com.coding.baekjoon.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(reader.readLine());

        int[][] arr = new int[100][100];
        int sum = 0;

        for (int i = 0; i < loop; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (arr[j][k] != 1) {
                        arr[j][k] = 1;
                        sum++;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}