package com.coding.baekjoon.스택큐덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class BOJ_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        String s;

        while (true) {
            s = reader.readLine();

            if (s.equals(".")) {
                break;
            }

            builder.append(checkBalance(s) ? "yes" : "no").append("\n");
        }

        System.out.println(builder);
    }

    private static boolean checkBalance(String s) {
        Stack<String> stack = new Stack<>();

        for (int j = 0; j < s.length(); j++) {
            switch (s.charAt(j)) {
                case '(':
                    stack.push("(");
                    break;
                case ')':
                    if (stack.isEmpty() || !stack.peek().equals("(")) {
                        return false;
                    }
                    stack.pop();
                    break;
                case '[':
                    stack.push("[");
                    break;
                case ']':
                    if (stack.isEmpty() || !stack.peek().equals("[")) {
                        return false;
                    }
                    stack.pop();
                    break;
            }
        }

        return stack.isEmpty();
    }
}