package com.coding.baekjoon.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(reader.readLine());

        double sum = 2;

        for (int i = 0; i < loop; i++) {
            sum += Math.pow(2, i);
        }

        System.out.println((int)Math.pow(sum, 2));
    }
}