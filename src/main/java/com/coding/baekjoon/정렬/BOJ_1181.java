package com.coding.baekjoon.정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

// Arrays.sort() 확장 연습 필수...

public class BOJ_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = reader.readLine();
        }

        Arrays.sort(arr, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            } else {
                return s1.length() - s2.length();
            }
        });

        builder.append(arr[0]).append("\n");

        for (int i = 1; i < n; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                builder.append(arr[i]).append("\n");
            }
        }

        System.out.println(builder);
    }
}