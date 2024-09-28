package com.coding.baekjoon.심화2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class BOJ_20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = reader.readLine();

            if (s.length() >= m) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(map.keySet());

        words.sort((o1, o2) -> {
            // 자주 등장하는 단어 순서대로 정렬
            if ((int) map.get(o1) != map.get(o2)) {
                return Integer.compare(map.get(o2), map.get(o1));
            }

            // 빈도 수 같으면 길이가 긴 단어가 먼저 오도록 정렬
            if (o1.length() != o2.length()) {
                return o2.length() - o1.length();
            }

            // 빈도 수와 길이가 같으면 사전 순으로 정렬
            return o1.compareTo(o2);
        });

        for (String s : words) {
            builder.append(s).append("\n");
        }

        System.out.println(builder);
    }
}