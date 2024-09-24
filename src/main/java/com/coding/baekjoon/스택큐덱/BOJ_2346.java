package com.coding.baekjoon.스택큐덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class BOJ_2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        Deque<int[]> deque = new ArrayDeque<>();

        int n = Integer.parseInt(reader.readLine());

        int[] balloons = new int[n];

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        // 배열 초기화
        for (int i = 0; i < n; i++) {
            balloons[i] = Integer.parseInt(tokenizer.nextToken());
        }

        // deque에 각 인덱스별 배열 넣기
        for (int i = 0; i < n; i++) {
            deque.offer(new int[] {(i + 1), balloons[i]});
        }

        while (!deque.isEmpty()) {
            int number = deque.peek()[1]; // 풍선에 적힌 값

            builder.append(deque.remove()[0]).append(" ");

            if (deque.isEmpty()) {
                break;
            }

            if (number > 0) {
                number -= 1;

                while (number-- > 0) {
                    deque.offerLast(deque.pollFirst());
                }
            } else {
                while (number++ < 0) {
                    deque.offerFirst(deque.pollLast());
                }
            }
        }

        System.out.println(builder);
    }
}