package com.coding.baekjoon.정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

/*
    x 좌표가 같을 때 y 좌표 비교하는 거 잊지 말자
    Arrays.sort()를 확장해 람다식으로 풀 수밖에 없는 문제였다
*/

public class BOJ_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            arr[i][0] = Integer.parseInt(tokenizer.nextToken());
            arr[i][1] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(arr, (n1, n2) -> n1[0] == n2[0] ? n1[1] - n2[1] : n1[0] - n2[0]);

        for (int i = 0; i < n; i++) {
            builder.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
        }

        System.out.println(builder);
    }
}