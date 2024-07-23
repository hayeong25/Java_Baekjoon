package com.coding.baekjoon.반복문;

import java.util.Scanner;

public class BOJ_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine()) / 4;

        for (int i = 0; i < n; i++) {
            System.out.print("long ");
        }

        System.out.println("int");
    }
}