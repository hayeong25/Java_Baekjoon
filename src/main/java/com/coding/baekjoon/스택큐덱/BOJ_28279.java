package com.coding.baekjoon.스택큐덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String s = reader.readLine();

            if (s.startsWith("1")) {
                String[] arr = s.split(" ");
                deque.offerFirst(Integer.parseInt(arr[1]));
            } else if (s.startsWith("2")) {
                String[] arr = s.split(" ");
                deque.offerLast(Integer.parseInt(arr[1]));
            } else {
                switch (Integer.parseInt(s)) {
                    case 3:
                        builder.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
                        break;
                    case 4:
                        builder.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
                        break;
                    case 5:
                        builder.append(deque.size()).append("\n");
                        break;
                    case 6:
                        builder.append(deque.isEmpty() ? 1 : 0).append("\n");
                        break;
                    case 7:
                        builder.append(deque.isEmpty() ? -1 : deque.getFirst()).append("\n");
                        break;
                    case 8:
                        builder.append(deque.isEmpty() ? -1 : deque.getLast()).append("\n");
                        break;
                }
            }
        }

        System.out.println(builder);
    }
}