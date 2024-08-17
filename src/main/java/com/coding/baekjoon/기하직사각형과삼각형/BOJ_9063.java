package com.coding.baekjoon.기하직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int xMax = -10001;
        int xMin = 10001;
        int yMax = -10001;
        int yMin = 10001;

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());

            xMax = Math.max(xMax, x);
            xMin = Math.min(xMin, x);
            yMax = Math.max(yMax, y);
            yMin = Math.min(yMin, y);
        }

        System.out.println((xMax - xMin) * (yMax - yMin));
    }
}