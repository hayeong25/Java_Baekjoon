package com.coding.baekjoon.약수배수와소수2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_17103 {
    public static boolean[] prime = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        get_prime();

        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(reader.readLine());

            int partitionCount = 0;

            // 순서만 다르고 두 소수가 같은 경우는 같은 파티션이므로 n/2
            for (int j = 2; j <= n / 2; j++) {
                // 두 수의 합이 n이고 그 두 수가 모두 소수일 때
                if (!prime[j]) { // 소수일 때
                    if (!prime[n - j]) { // n - 소수 = 소수일 때
                        partitionCount++;
                    }
                }
            }

            builder.append(partitionCount).append("\n");
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