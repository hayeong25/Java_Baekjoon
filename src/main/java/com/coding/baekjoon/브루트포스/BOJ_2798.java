package com.coding.baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        int[] arr = new int[n];

        tokenizer = new StringTokenizer(reader.readLine(), " ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        System.out.println(findM(arr, n, m));
    }

    private static int findM(int[] arr, int n, int m) {
        int result = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if (sum == m) {
                        return sum;
                    }

                    if (result < sum && sum < m) {
                        result = sum;
                    }
                }
            }
        }

        return result;
    }
}