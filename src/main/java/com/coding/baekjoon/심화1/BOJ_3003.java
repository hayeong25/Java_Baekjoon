package com.coding.baekjoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int king = 1 - Integer.parseInt(tokenizer.nextToken());
        int queen = 1 - Integer.parseInt(tokenizer.nextToken());
        int rook = 2 - Integer.parseInt(tokenizer.nextToken());
        int bishop = 2 - Integer.parseInt(tokenizer.nextToken());
        int knight = 2 - Integer.parseInt(tokenizer.nextToken());
        int pawn = 8 - Integer.parseInt(tokenizer.nextToken());

        System.out.println(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
    }
}