package com.coding.baekjoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine().replaceAll("c=", "1")
                .replaceAll("c-", "1")
                .replaceAll("dz=", "1")
                .replaceAll("d-", "1")
                .replaceAll("lj", "1")
                .replaceAll("nj", "1")
                .replaceAll("s=", "1")
                .replaceAll("z=", "1")
                .strip();

        System.out.println(s.length());
    }
}