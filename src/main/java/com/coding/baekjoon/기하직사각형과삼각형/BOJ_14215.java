package com.coding.baekjoon.기하직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int[] arr = new int[3];

        arr[0] = Integer.parseInt(tokenizer.nextToken());
        arr[1] = Integer.parseInt(tokenizer.nextToken());
        arr[2] = Integer.parseInt(tokenizer.nextToken());

        Arrays.sort(arr);

        while (arr[2] >= arr[0] + arr[1]) {
            arr[2] -= 1;
        }

        System.out.println(arr[0] + arr[1] + arr[2]);
    }
}