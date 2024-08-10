package com.coding.baekjoon.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[][] arr = new String[15][5];

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();

            for (int j = 0; j < s.length(); j++) {
                arr[j][i] = String.valueOf(s.charAt(j));
            }
        }

        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print(string != null ? string : "");
            }
        }
    }
}