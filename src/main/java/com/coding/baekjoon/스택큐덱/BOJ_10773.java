package com.coding.baekjoon.스택큐덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class BOJ_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(reader.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(reader.readLine());

            if (n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        int sum = 0;

        for (int i : stack) {
            sum += i;
        }

        System.out.println(sum);
    }
}