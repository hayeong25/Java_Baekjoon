package com.coding.baekjoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < loop; i++) {
            if (checkStr(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean checkStr(String str) {
        boolean[] arr = new boolean[26];
        int prev = 0;

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) {
                if (!arr[now - 97]) {
                    arr[now - 97] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}