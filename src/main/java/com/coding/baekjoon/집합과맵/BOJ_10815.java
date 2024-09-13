package com.coding.baekjoon.집합과맵;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        int[] arr = new int[n];

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(arr); // 이분 탐색을 위한 정렬

        int m = Integer.parseInt(reader.readLine());

        tokenizer = new StringTokenizer(reader.readLine());

        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(tokenizer.nextToken());

            builder.append(binarySeach(arr, n, target)).append(" ");
        }

        System.out.println(builder);
    }

    public static int binarySeach(int[] arr, int n, int target) {
        int leftIdx = 0;
        int rightIdx = n - 1;

        while (leftIdx <= rightIdx) {
            int middle = (leftIdx + rightIdx) / 2;
            int middleValue = arr[middle];

            if (target > middleValue) {
                leftIdx = middle + 1;
            } else if (target < middleValue) {
                rightIdx = middle - 1;
            } else {
                return 1;
            }
        }

        return 0;
    }
}