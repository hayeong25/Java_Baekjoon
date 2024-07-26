package com.coding.baekjoon.반복문;

import java.util.Scanner;

public class BOJ_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                if (j > (count - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}