package com.coding.baekjoon.정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class BOJ_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        int[] origin = new int[n];

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        for (int i = 0; i < n; i++) {
            origin[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int[] sorted = origin.clone();

        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();

        int value = 0;

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], value);
                value++;
            }
        }

        for (int i = 0; i < n; i++) {
            builder.append(map.get(origin[i])).append(" ");
        }

        System.out.println(builder);
    }
}