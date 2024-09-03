package com.coding.baekjoon.정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
            arr[i][0] = tokenizer.nextToken();
            arr[i][1] = tokenizer.nextToken();
        }

        Arrays.sort(arr, Comparator.comparingInt(s -> Integer.parseInt(s[0])));

        for (int i = 0; i < n; i++) {
            builder.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.println(builder);
    }
}