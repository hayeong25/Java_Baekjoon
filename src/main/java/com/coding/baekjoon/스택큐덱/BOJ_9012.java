package com.coding.baekjoon.스택큐덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
            String s = reader.readLine();

            builder.append(checkVps(s) ? "YES" : "NO").append("\n");
        }

        System.out.println(builder);
    }

    private static boolean checkVps(String s) {
        if (s.startsWith(")")) {
            return false;
        }

        Stack<String> stack = new Stack<>();

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '(') {
                stack.push("(");
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}