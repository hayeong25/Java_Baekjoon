package com.coding.baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());

        int[] aArr = new int[a];
        int[] bArr = new int[b];

        tokenizer = new StringTokenizer(reader.readLine(), " ");

        for (int i = 0; i < a; i++) {
            aArr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        tokenizer = new StringTokenizer(reader.readLine(), " ");

        for (int i = 0; i < b; i++) {
            bArr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(aArr);
        Arrays.sort(bArr);

        int count = 0;

        for (int i = 0; i < a; i++) {
            if (!binarySearch(bArr, aArr[i])) {
                count++;
            }
        }

        for (int i = 0; i < b; i++) {
            if (!binarySearch(aArr, bArr[i])) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean binarySearch(int[] arr, int target) {
        int leftIdx = 0;
        int rightIdx = arr.length - 1;

        while (leftIdx <= rightIdx) {
            int middle = (leftIdx + rightIdx) / 2;
            int middleValue = arr[middle];

            if (target > middleValue) {
                leftIdx = middle + 1;
            } else if (target < middleValue) {
                rightIdx = middle - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}