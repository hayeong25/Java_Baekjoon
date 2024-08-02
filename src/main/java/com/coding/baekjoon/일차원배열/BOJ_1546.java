package com.coding.baekjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(reader.readLine());

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        double max = 0;
        double[] scoreArr = new double[length];

        for (int i = 0; i < length; i++) {
            scoreArr[i] = Integer.parseInt(tokenizer.nextToken());

            if (max < scoreArr[i]) {
                max = scoreArr[i];
            }
        }

        double avg = 0;

        for (int i = 0; i < length; i++) {
            scoreArr[i] = scoreArr[i] / max * 100;
            avg += scoreArr[i];
        }

        System.out.println(avg / length);
    }
}