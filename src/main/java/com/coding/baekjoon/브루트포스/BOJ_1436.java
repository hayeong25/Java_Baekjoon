package com.coding.baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int count = 0;
        int number = 666;

        while (count != n) {
            if (String.valueOf(number).contains("666")) {
                count++;
            }

            number++;
        }

        System.out.println(number - 1);
    }
}