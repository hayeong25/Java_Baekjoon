package com.coding.baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(reader.readLine());
        int sum = 0;

        String[] strArr = reader.readLine().split("");

        for (int i = 0; i < loop; i++) {
            sum += Integer.parseInt(strArr[i]);
        }

        System.out.println(sum);
    }
}