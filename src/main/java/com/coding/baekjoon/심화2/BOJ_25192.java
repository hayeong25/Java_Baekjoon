package com.coding.baekjoon.심화2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class BOJ_25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Set<String> set = new HashSet<>();

        int result = 0;

        for (int i = 0; i < n; i++) {
            String chat = reader.readLine();

            if (chat.equals("ENTER")) {
                result += set.size();
                set.clear();
            } else {
                set.add(chat);
            }
        }

        result += set.size();

        System.out.println(result);
    }
}