package com.coding.baekjoon.기하직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] xArr = new int[3];
        int[] yArr = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

            xArr[i] = Integer.parseInt(tokenizer.nextToken());
            yArr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int x = xArr[0] == xArr[1] ? xArr[2] : (xArr[0] == xArr[2] ? xArr[1] : xArr[0]);
        int y = yArr[0] == yArr[1] ? yArr[2] : (yArr[0] == yArr[2] ? yArr[1] : yArr[0]);

        System.out.println(x + " " + y);
    }
}