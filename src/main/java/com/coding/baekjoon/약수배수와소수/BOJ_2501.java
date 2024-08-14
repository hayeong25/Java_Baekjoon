package com.coding.baekjoon.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        List<Integer> divisorList = new ArrayList<>();

        int p = Integer.parseInt(tokenizer.nextToken());
        int q = Integer.parseInt(tokenizer.nextToken());

        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                divisorList.add(i);
            }
        }

        Collections.sort(divisorList);

        if (divisorList.size() < q) {
            System.out.println(0);
        } else {
            System.out.println(divisorList.get(q - 1));
        }
    }
}