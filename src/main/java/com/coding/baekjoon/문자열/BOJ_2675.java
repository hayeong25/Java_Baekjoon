package com.coding.baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(reader.readLine());

        for (int i = 0; i < loop; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

            int repeat = Integer.parseInt(tokenizer.nextToken());
            String s = tokenizer.nextToken();

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    System.out.print(s.charAt(j));
                }
            }

            System.out.println();
        }
    }
}