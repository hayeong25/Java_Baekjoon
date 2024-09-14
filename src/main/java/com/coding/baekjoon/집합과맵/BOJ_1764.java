package com.coding.baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        String[] nArr = new String[n];

        for (int i = 0; i < n; i++) {
            nArr[i] = reader.readLine();
        }

        Arrays.sort(nArr);

        Set<String> result = new TreeSet<>();

        for (int i = 0; i < m; i++) {
            String name = reader.readLine();

            if (binarySearch(nArr, name)) {
                result.add(name);
            }
        }

        System.out.println(result.size());

        for (String s : result) {
            System.out.println(s);
        }
    }

    private static boolean binarySearch(String[] arr, String target) {
        int leftIdx = 0;
        int rightIdx = arr.length - 1;

        while (leftIdx <= rightIdx) {
            int middle = (leftIdx + rightIdx) / 2;
            String middleValue = arr[middle];

            if (target.compareTo(middleValue) > 0) {
                leftIdx = middle + 1;
            } else if (target.compareTo(middleValue) < 0) {
                rightIdx = middle - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}