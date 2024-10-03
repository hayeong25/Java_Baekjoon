package com.coding.baekjoon.재귀;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2447 {
    static boolean[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        arr = new boolean[n][n];

        star(0, 0, n, false);

        for (boolean[] row : arr) {
            for (boolean column : row) {
                builder.append(column ? " " : "*");
            }

            builder.append("\n");
        }

        System.out.println(builder);
    }

    private static void star(int row, int column, int n, boolean blank) {
        if (blank) {
            for (int i = row; i < row + n; i++) {
                for (int j = column; j < column + n; j++) {
                    arr[i][j] = true;
                }
            }

            return;
        }

        if (n == 1) {
            arr[row][column] = false;

            return;
        }

        int size = n / 3;
        int count = 0; // 항상 5번째에 공백이 생기므로 count == 5 체크

        for (int i = row; i < row + n; i += size) {
            for (int j = column; j < column + n; j += size) {
                count++;

                star(i, j, size, count == 5);
            }
        }
    }
}