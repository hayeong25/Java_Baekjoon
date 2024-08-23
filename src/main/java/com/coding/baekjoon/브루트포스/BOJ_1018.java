package com.coding.baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

// 어떤 크기로 주어지든, 최소로 칠할 수 있는 8×8 크기를 찾아내야 한다

public class BOJ_1018 {
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        boolean[][] arr = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = reader.readLine();

            for (int j = 0; j < m; j++) {
                arr[i][j] = (str.charAt(j) == 'W'); // W = true / B = false
            }
        }

        int n_row = n - 7;
        int m_col = m - 7;

        for (int i = 0; i < n_row; i++) {
            for (int j = 0; j < m_col; j++) {
                find(arr, i, j);
            }
        }

        System.out.println(min);
    }

    public static void find(boolean[][] arr, int x, int y) {
        boolean correct_color = arr[x][y];

        int count = 0;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {

                // 올바른 색이 아닐 경우 count 1 증가
                if (arr[i][j] != correct_color) {
                    count++;
                }

                // 다음 칸은 색이 바뀌므로 true라면 false로, false라면 true로 값 변경
                correct_color = (!correct_color);
            }

            correct_color = !correct_color;
        }

        /*
         *  count : 첫번째 칸을 기준으로 할 때 색칠할 개수
         *  64 - count : 첫번째 칸의 반대 색을 기준으로 할 때 색칠할 개수
         */
        count = Math.min(count, 64 - count);

        min = Math.min(min, count);
    }
}