package com.coding.baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        Map<String, Integer> nameMap = new HashMap<>();
        Map<Integer, String> numberMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = reader.readLine();

            nameMap.put(name, i);
            numberMap.put(i, name);
        }

        for (int i = 0; i < m; i++) {
            String s = reader.readLine();
            if (48 <= s.charAt(0) && s.charAt(0) <= 57) {
                System.out.println(numberMap.get(Integer.parseInt(s)));
            } else {
                System.out.println(nameMap.get(s));
            }
        }
    }
}