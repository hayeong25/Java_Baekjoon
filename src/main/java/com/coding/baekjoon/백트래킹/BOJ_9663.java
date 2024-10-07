package com.coding.baekjoon.백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_9663 {
    static int N;
    static int[] board;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(reader.readLine());

        board = new int[N];

        func(0);

        System.out.println(result);
    }

    private static void func(int count) {
        if (count == N) {
            result++;
            return;
        }

        for (int i = 0; i < N; i++) {
            board[count] = i;

            if (isAvaliable(count)) {
                func(count + 1);
            }
        }
    }

    private static boolean isAvaliable(int row) {
        for (int i = 0; i < row; i++) {
            if (board[row] == board[i]) {
                return false;
            }

            if (Math.abs(row - i) == Math.abs(board[row] - board[i])) {
                return false;
            }
        }

        return true;
    }
}