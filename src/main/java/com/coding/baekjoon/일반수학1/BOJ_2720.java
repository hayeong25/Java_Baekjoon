package com.coding.baekjoon.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(reader.readLine());

        for (int i = 0 ; i < loop; i++) {
            int amount = Integer.parseInt(reader.readLine());

            int quarter = amount / 25;
            int dime = (amount % 25) / 10;
            int nickel = ((amount % 25) % 10) / 5;
            int penny = ((amount % 25) % 10) % 5;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}