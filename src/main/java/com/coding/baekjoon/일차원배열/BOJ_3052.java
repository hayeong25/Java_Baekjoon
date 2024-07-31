package com.coding.baekjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> remainSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(reader.readLine()) % 42;

            remainSet.add(n);
        }

        System.out.println(remainSet.size());
    }
}