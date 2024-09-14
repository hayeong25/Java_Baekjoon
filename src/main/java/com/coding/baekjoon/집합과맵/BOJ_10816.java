package com.coding.baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(tokenizer.nextToken());

            map.merge(card, 1, Integer::sum);
        }

        int m = Integer.parseInt(reader.readLine());

        tokenizer = new StringTokenizer(reader.readLine(), " ");

        for (int i = 0; i < m; i++) {
            int count = Integer.parseInt(tokenizer.nextToken());

            if (map.get(count) == null) {
                builder.append(0).append(" ");
            } else {
                builder.append(map.get(count)).append(" ");
            }
        }

        System.out.println(builder);
    }
}