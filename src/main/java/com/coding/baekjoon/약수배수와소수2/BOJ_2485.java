package com.coding.baekjoon.약수배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        int divisor = 0;
        int sum = 0;

        for (int i = 1; i < n; ++i) {
            int distance = arr[i] - arr[i - 1]; // 두 가로수 간 거리

            divisor = gcd(distance, divisor); // 두 가로수의 최대공약수를 저장
        }

        for (int i = 1; i < n; ++i) {
            sum += ((arr[i] - arr[i - 1]) / divisor) - 1; // '(두 가로수의 거리 / 최대공약수) -1' 를 더함
        }

        System.out.println(sum);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}