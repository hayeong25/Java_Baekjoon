package com.coding.baekjoon.약수배수와소수2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_4948 {
    // 1 ≤ n ≤ 123456이므로 2n = 246912
    // 배열은 0부터 시작하니까 [2n + 1]
    public static boolean[] prime = new boolean[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        get_prime();

        while (true) {
            int n = Integer.parseInt(reader.readLine());

            if (n == 0) {
                break;
            }

            int count = 0;

            for (int i = n + 1; i <= 2 * n; i++) {
                if (!prime[i]) {
                    count++;
                }
            }

            builder.append(count).append('\n');
        }

        System.out.print(builder);
    }

    // 소수 여부 boolean 배열 세팅
    public static void get_prime() {
        prime[0] = prime[1] = true; // 0과 1은 소수 X

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }

            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}