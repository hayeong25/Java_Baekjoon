package com.coding.baekjoon.심화2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Set<String> set = new HashSet<>();
        set.add("ChongChong");

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

            String a = tokenizer.nextToken();
            String b = tokenizer.nextToken();

            if (set.contains(a) || set.contains(b)) {
                set.add(a);
                set.add(b);
            }
        }

        System.out.println(set.size());
    }
}