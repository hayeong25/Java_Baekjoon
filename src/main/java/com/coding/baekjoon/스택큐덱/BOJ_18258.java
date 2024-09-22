package com.coding.baekjoon.스택큐덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        Queue<Integer> queue = new LinkedList<>();

        int last = 0;

        for (int i = 0; i < n; i++) {
            String s = reader.readLine();

            if (s.startsWith("push")) {
                String[] arr = s.split(" ");
                last = Integer.parseInt(arr[1]);
                queue.add(Integer.parseInt(arr[1]));
            } else {
                switch (s) {
                    case "pop":
                        builder.append(queue.isEmpty() ? -1 : queue.remove()).append("\n");
                        break;
                    case "size":
                        builder.append(queue.size()).append("\n");
                        break;
                    case "empty":
                        builder.append(queue.isEmpty() ? 1 : 0).append("\n");
                        break;
                    case "front":
                        builder.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
                        break;
                    case "back":
                        builder.append(queue.isEmpty() ? -1 : last).append("\n");
                        break;
                }
            }
        }

        System.out.println(builder);
    }
}