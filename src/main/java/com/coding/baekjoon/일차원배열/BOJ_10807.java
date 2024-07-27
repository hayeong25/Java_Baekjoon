package com.coding.baekjoon.일차원배열;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = Integer.parseInt(sc.nextLine());

        List<Integer> list = new ArrayList<>(length);

        for (int i = 0; i < length; i++) {
            list.add(sc.nextInt());
        }

        int target = sc.nextInt();

        System.out.println(Collections.frequency(list, target));
    }
}