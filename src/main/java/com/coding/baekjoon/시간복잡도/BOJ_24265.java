package com.coding.baekjoon.시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    MenOfPassion 알고리즘은 n(n−1) / 2번 실행된다.
    n만큼 수행 횟수가 늘어나기 때문에 O(n)이고 차수는 2
    ∴ 수행 횟수는 n(n−1) / 2, 수행 시간은 2
*/

public class BOJ_24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(reader.readLine());

        System.out.println(n * (n - 1) / 2);
        System.out.println(2);
    }
}