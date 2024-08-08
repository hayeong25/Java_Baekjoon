package com.coding.baekjoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().toUpperCase();

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 65]++;
        }

        int max = 0;
        char c = '?';

        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                c = '?';
            } else if (max < arr[i]) {
                max = arr[i];
                c = (char)(i + 65);
            }
        }

        System.out.println(c);
    }
}