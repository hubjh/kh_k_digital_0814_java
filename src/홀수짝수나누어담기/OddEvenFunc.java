package 홀수짝수나누어담기;

import java.util.Scanner;

/*
Date : 2023-08-30
Author : J.H.Hwang
Purpose :  7개의 정수를 입력 받아 홀, 짝을 나누어 배열에 담는 프로그램입니다.
 */
public class OddEvenFunc {
    int[] input = new int[7];   // 입력이 7개로 제한 되어 있음
    int[] even = new int[7];
    int[] odd = new int[7];
    int eCnt = 0, oCnt = 0;
    // 7개의 정수를 입력 받아서 배열에 넣기
    public void inputFunc() {
        System.out.print("입력 : ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 7; i++) {
            input[i] = sc.nextInt();
        }
    }
    public void oddEvenCalc() {

        for (int e : input) {
            if(e % 2 == 0) even[eCnt++] = e;
            else odd[oCnt++] = e;
        }

    }
    public void oddEvenOutput() {
        System.out.println();
        System.out.print("홀수 : ");
        for(int i = 0; i < oCnt; i++) System.out.printf("%2d", odd[i]);
        System.out.println();
        System.out.print("짝수 : ");
        for(int i = 0; i < eCnt; i++) System.out.printf("%2d", even[i]);

    }
}
