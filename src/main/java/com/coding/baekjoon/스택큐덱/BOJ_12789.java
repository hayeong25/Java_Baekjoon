package com.coding.baekjoon.스택큐덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(reader.readLine());

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(tokenizer.nextToken()));
        }

        builder.append(checkOrder(queue) ? "Nice" : "Sad");

        System.out.println(builder);
    }

    private static boolean checkOrder(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        int order = 1;

        while (!queue.isEmpty()) {
            if (queue.peek() == order) {
                queue.remove();
                order++;
            } else if (!stack.isEmpty() && stack.peek() == order) {
                stack.pop();
                order++;
            } else {
                stack.push(queue.remove());
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == order) {
                stack.pop();
                order++;
            } else {
                return false;
            }
        }

        return true;
    }
}