package com.coding.baekjoon.반복문;

import java.util.Scanner;

public class BOJ_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAmount = Integer.parseInt(sc.nextLine());
        int totalCount = Integer.parseInt(sc.nextLine());

        for (int i = totalCount; i > 0; i--) {
            int amount = sc.nextInt();
            int count = sc.nextInt();

            totalAmount = totalAmount - (amount * count);
        }

        if (totalAmount == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}