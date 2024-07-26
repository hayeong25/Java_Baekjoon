package com.coding.baekjoon.반복문;

import java.util.Scanner;

public class BOJ_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 1;

        while (a != 0) {
            a = sc.nextInt();
            int b = sc.nextInt();

            if (b != 0) {
                System.out.println(a + b);
            }
        }
    }
}