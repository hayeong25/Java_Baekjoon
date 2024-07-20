package com.coding.baekjoon.조건문;

import java.util.Scanner;

public class BOJ_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArr = sc.nextLine().split(" ");
        int time = Integer.parseInt(sc.nextLine());

        int h = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]) + time;

        if (m >= 60) {
            h = h + (m / 60);
            m = m % 60;

            if (h >= 24) {
                h = h - 24;
            }
        }

        System.out.println(h + " " + m);
    }
}