package com.coding.baekjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int length = Integer.parseInt(tokenizer.nextToken());
        int loop = Integer.parseInt(tokenizer.nextToken());

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < loop; i++) {
            tokenizer = new StringTokenizer(reader.readLine(), " ");

            int start = Integer.parseInt(tokenizer.nextToken()) - 1;
            int end = Integer.parseInt(tokenizer.nextToken()) - 1;

            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}