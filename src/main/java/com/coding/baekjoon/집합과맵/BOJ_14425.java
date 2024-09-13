package com.coding.baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        List<String> strList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            strList.add(reader.readLine());
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            if (strList.contains(reader.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}