package com.coding.baekjoon.반복문;

import java.util.Scanner;

public class BOJ_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #" + i + ": " + (a+b));
        }
    }
}