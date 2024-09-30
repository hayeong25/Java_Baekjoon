package com.coding.baekjoon.재귀;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_25501 {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
            String s = reader.readLine();

            builder.append(isPalindrome(s)).append(" ").append(count).append("\n");

            count = 0;
        }

        System.out.println(builder);
    }

    public static int recursion(String s, int l, int r) {
        count++;

        if (l >= r) {
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {
            return recursion(s, l + 1, r - 1);
        }
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
}