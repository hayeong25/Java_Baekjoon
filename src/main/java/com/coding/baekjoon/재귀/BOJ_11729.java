package com.coding.baekjoon.재귀;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_11729 {
    static StringBuilder builder = new StringBuilder();
    static int count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        hanoi(n, 1, 3, 2);

        System.out.println(count + "\n" + builder);
    }

    private static void hanoi(int n, int from, int to, int tmp) {
        count++;

        if (n == 1) {
            builder.append(from).append(" ").append(to).append("\n");
            return;
        }

        // 1번 장대 -> 3번 장대로 옮긴다고 가정할 떄,
        // STEP 1 : n-1개를 1에서 2로 이동 (= from 지점의 n-1개의 원판을 tmp 지점으로 옮긴다)
        hanoi(n - 1, from, tmp, to);

        // STEP 2 : 맨 아래에 남아 있는 1개를 1에서 3으로 이동 (= from 지점의 n번째 원판을 to 지점으로 옮긴다)
        builder.append(from).append(" ").append(to).append("\n");

        // STEP 3 : 아까 2로 옮겨놨던 n-1개를 2에서 3으로 이동 (= tmp 지점의 n-1개의 원판을 to 지점으로 옮긴다)
        hanoi(n - 1, tmp, to, from);
    }
}