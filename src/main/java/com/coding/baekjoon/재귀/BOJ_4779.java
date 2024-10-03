package com.coding.baekjoon.재귀;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_4779 {
    static boolean[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        String s;

        while ((s = reader.readLine()) != null) {
            int length = (int) Math.pow(3, Integer.parseInt(s));

            arr = new boolean[length];

            if (length != 1) {
                change(arr, 0, length);
            }

            for (boolean b : arr) {
                builder.append(b ? " " : "-");
            }

            builder.append("\n");
        }

        System.out.println(builder);
    }

    private static void change(boolean[] arr, int startIdx, int endIdx) {
        if (endIdx - startIdx == 1 || endIdx == startIdx) {
            return;
        }

        int start = startIdx + ((endIdx - startIdx) / 3);
        int end = start + ((endIdx - startIdx) / 3);

        for (int i = start; i < end; i++) {
            arr[i] = true;
        }

        change(arr, startIdx, start);
        change(arr, end, endIdx);
    }
}