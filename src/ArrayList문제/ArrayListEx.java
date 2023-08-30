package ArrayList문제;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Date : 2023-08-30
Author : J.H.Hwang
Purpose : 배열리스트를 활용한 예지 프로그램입니다.
 */
//### [문제]
//
//        정수 N개로 이루어진 배열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//
//        ### [입력]
//
//        첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
//
//        둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
//
//        ### [출력]
//
//        X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
//          10 5
//          1 10 4 9 2 3 8 5 7 6
//        ###
public class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> seq = new ArrayList<>();
        // 정수 N , X 입력 받는 메소드
        System.out.print("입력 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 배열의 갯수
        int x = sc.nextInt();   // 크기를 비교하는 기준 값 (미만 값을 찾음)
        for (int i = 0; i < n; i++) {
            seq.add(sc.nextInt());
            if (seq.get(i) < x) System.out.print(seq.get(i) + " ");
        }
    }
}
