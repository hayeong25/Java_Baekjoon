package com.coding.baekjoon.스택큐덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        int[] queueStack = new int[n];
        int[] currentList = new int[n];

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < n; i++) {
            queueStack[i] = Integer.parseInt(tokenizer.nextToken());
        }

        tokenizer = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < n; i++) {
            currentList[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int m = Integer.parseInt(reader.readLine());

        int[] insertList = new int[m];

        tokenizer = new StringTokenizer(reader.readLine(), " ");

        for (int i = 0; i < m; i++) {
            insertList[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (queueStack[i] == 0) {
                deque.addFirst(currentList[i]);
            }
        }

        for (int i = 0; i < m; i++) {
            deque.add(insertList[i]);
            builder.append(deque.pollFirst()).append(" ");
        }

        System.out.println(builder);
    }
}