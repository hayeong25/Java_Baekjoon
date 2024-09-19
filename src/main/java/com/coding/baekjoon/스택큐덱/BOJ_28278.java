package com.coding.baekjoon.스택큐덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class BOJ_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String s = reader.readLine();

            if (s.startsWith("1")) {
                String[] arr = s.split(" ");
                stack.push(Integer.parseInt(arr[1]));
            } else {
                switch (Integer.parseInt(s)) {
                    case 2:
                        builder.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                        break;
                    case 3:
                        builder.append(stack.size()).append("\n");
                        break;
                    case 4:
                        builder.append(stack.isEmpty() ? 1 : 0).append("\n");
                        break;
                    case 5:
                        builder.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                        break;
                }
            }
        }

        System.out.println(builder);
    }
}