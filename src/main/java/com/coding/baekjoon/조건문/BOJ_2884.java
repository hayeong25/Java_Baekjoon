package com.coding.baekjoon.조건문;

import java.util.Scanner;

public class BOJ_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt() - 45;

        if (m < 0) {
            h = h - 1;
            m = 60 + m;

            if (h == -1) {
                h = 23;
            }
        }

        System.out.println(h + " " + m);
    }
}