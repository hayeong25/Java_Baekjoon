package com.coding.baekjoon.시간복잡도;

/*
    n에 어떤 수가 들어오든 MenOfPassion 알고리즘은 딱 1번만 실행된다.
    수행 횟수를 다항식으로 나타냈을 때의 최고차항 차수 = 수행 시간 = 시간 복잡도
    1번만 수행되기에 수행 시간은 O(1)이고 차수는 0
    ∴ n 값에 상관 없이 수행 횟수는 1, 수행 시간은 0으로 출력
*/

public class BOJ_24262 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(0);
    }
}