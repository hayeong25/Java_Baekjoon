package com.coding.baekjoon.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());

        int squareCount = 1; // 해당 대각선에 있는 칸의 개수
        int squareSum = 0; // 해당 대각선의 전 대각선 칸 누적

        while (true) {
            // 해당 대각선의 전 대각선 칸의 누적 + 현재 해당하는 대각선의 칸의 개수보다 X번째가 작다는 건 현재 해당하는 대각선에 해당 X번째의 분수가 있다는 것
            if (x <= squareSum + squareCount) {
                if (squareCount % 2 == 1) {
                    // 해당 대각선의 칸 개수가 홀수 → 분자+분모 = 짝수
                    // 대각선 개수가 홀수면 위쪽(↗︎) 으로 순회 -> 분자 감소, 분모 증가
                    // 분모 : x - 칸 누적 개수
                    // ︎분자 : 현재 대각선에 있는 칸 개수 - (분모 - 1)
                    System.out.println((squareCount - (x - squareSum - 1) + "/" + (x - squareSum)));
                    break;
                } else {
                    // 해당 대각선의 칸의 개수가 짝수 → 분자+분모 = 홀수
                    // 대각선 개수가 짝수면 아래쪽(↙︎︎) 으로 순회 -> 분자 증가, 분모 감소
                    // ︎분자 : x - 칸 누적 개수
                    // 분모 : 현재 대각선에 있는 칸 개수 - (분자 - 1)
                    System.out.println((x - squareSum) + "/" + (squareCount - (x - squareSum - 1)));
                    break;
                }
            } else {
                // 아직 X번째 분수가 해당 대각선에 포함하지 않는 경우
                squareSum += squareCount;
                squareCount++; // 대각선 늘어날 때마다 해당 칸 개수도 +1
            }
        }
    }
}