package com.coding.baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Arrays.sort는 시간 복잡도가 O(n^2) 될 수도 있으니 시간 초과에 유의
    최악의 경우에도 O(nlog^n)을 보장하거나 O(n)에 가까운 정렬 알고리즘 사용 !
    출력 시에도 시간 초과 날 수 있으니 StringBuilder로 한 번에 출력해야 한다
*/

public class BOJ_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(list);

        for (int i : list) {
            builder.append(i).append("\n");
        }

        System.out.println(builder);
    }
}