package com.coding.baekjoon.반복문;

import java.util.Scanner;

public class BOJ_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int n = Integer.parseInt(sc.nextLine());

        for (int i = n; i > 0; i--) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}