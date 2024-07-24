package com.coding.baekjoon.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter((System.out)));

        int count = Integer.parseInt(reader.readLine());

        for (int i = count; i > 0; i--) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());

            writer.write(a + b + "\n");
        }

        writer.flush();
        writer.close();
    }
}