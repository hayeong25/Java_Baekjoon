package com.coding.baekjoon.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        boolean flag = true;
        int start = 2;
        int result = 1;

        while (flag) {
            if (start <= n) {
                start += 6 * result;
            }

            if (n < start) {
                flag = false;
                System.out.println(n == 1 ? 1 : result + 1);
            }

            result++;
        }
    }
}