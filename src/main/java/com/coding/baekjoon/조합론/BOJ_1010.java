package com.coding.baekjoon.조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_1010 {
    private static final int[][] arr = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

            // M개 중 N개를 뽑는 경우이므로 nCr에서 n = M, r = N
            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());

            builder.append(bc(m, n)).append('\n');
        }

        System.out.println(builder);
    }

    private static int bc(int n, int r) {
        if (arr[n][r] > 0) {
            return arr[n][r];
        }

        // nC0 = nCn = 1
        if (n == r || r == 0) {
            return arr[n][r] = 1;
        }

        // nCr = (n-1)C(r-1) + (n-1)Cr
        return arr[n][r] = bc(n - 1, r - 1) + bc(n - 1, r);
    }
}