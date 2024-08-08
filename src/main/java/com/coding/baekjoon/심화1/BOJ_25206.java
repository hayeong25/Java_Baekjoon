package com.coding.baekjoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double count = 0;
        double sum = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

            tokenizer.nextToken();
            double credit = Double.parseDouble(tokenizer.nextToken());
            String grade = tokenizer.nextToken();

            switch (grade) {
                case "A+":
                    sum += credit * 4.5;
                    break;
                case "A0":
                    sum += credit * 4.0;
                    break;
                case "B+":
                    sum += credit * 3.5;
                    break;
                case "B0":
                    sum += credit * 3.0;
                    break;
                case "C+":
                    sum += credit * 2.5;
                    break;
                case "C0":
                    sum += credit * 2.0;
                    break;
                case "D+":
                    sum += credit * 1.5;
                    break;
                case "D0":
                    sum += credit;
                    break;
                case "F":
                    sum += credit * 0.0;
                    break;
                case "P":
                    break;
            }

            if (!grade.equals("P")) {
                count += credit;
            }
        }

        System.out.printf("%.6f", sum / count);
    }
}