package com.coding.baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(reader.readLine());

        for (int i = 0; i < loop; i++) {
            String s = reader.readLine();

            System.out.print(s.charAt(0));
            System.out.println(s.charAt(s.length() - 1));
        }
    }
}