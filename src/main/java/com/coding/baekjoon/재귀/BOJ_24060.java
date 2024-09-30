package com.coding.baekjoon.재귀;

import java.util.*;
import java.io.*;

public class BOJ_24060 {
    static int N;
    static int K;
    static int count = 0;
    static int result = -1;
    static int[] arr;
    static int[] tmp;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        N = Integer.parseInt(tokenizer.nextToken());
        K = Integer.parseInt(tokenizer.nextToken());

        arr = new int[N];
        tmp = new int[N];

        tokenizer = new StringTokenizer(reader.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        mergeSort(0, N - 1);

        System.out.println(result);
    }

    static void mergeSort(int start, int end) {
        if (count > K) {
            return;
        }

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            merge(start, mid, end);
        }
    }

    static void merge(int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        while (i <= mid) {
            tmp[t++] = arr[i++];
        }

        while (j <= end) {
            tmp[t++] = arr[j++];
        }

        i = start;
        t = 0;

        while (i <= end) {
            count++;

            if (count == K) {
                result = tmp[t];
                return;
            }

            arr[i++] = tmp[t++];
        }
    }
}