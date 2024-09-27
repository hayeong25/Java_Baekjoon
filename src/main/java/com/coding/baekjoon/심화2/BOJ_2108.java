package com.coding.baekjoon.심화2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class BOJ_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        int[] arr = new int[n];

        double sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
            sum += arr[i];
        }

        builder.append((int) Math.round(sum / n)).append("\n");

        Arrays.sort(arr);

        builder.append(arr[n / 2]).append("\n");

        int count = 0;
        int maxCount = -1;
        int mod = arr[0];
        boolean check = false;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 0;
            }

            if (maxCount < count) {
                maxCount = count;
                mod = arr[i];
                check = true;
            } else if (maxCount == count && check) {
                mod = arr[i];
                check = false;
            }
        }

        builder.append(mod).append("\n");

        builder.append(arr[n - 1] - arr[0]).append("\n");

        System.out.println(builder);
    }
}