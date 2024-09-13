package com.coding.baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Set<String> nameSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

            String name = tokenizer.nextToken();
            String status = tokenizer.nextToken();

            if (status.equals("enter")) {
                nameSet.add(name);
            } else {
                nameSet.remove(name);
            }
        }

        for (String s : nameSet) {
            System.out.println(s);
        }
    }
}