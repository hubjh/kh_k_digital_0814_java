package 별찍기연습;

import java.util.Scanner;

/*
Date : 2023-08-18
Author : J.H.Hwang
Purpose : 별을 찍는 프로그램입니다.
 */
//  삼각형 별찍기
// 입력 받은 수 만큼 별찍기
// 5를 입력 하면
// *
// * *
// * * *
// * * * *
// * * * * *
public class StarEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("별 개수 입력 : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) System.out.print("* ");
            System.out.print("\n");
        }

//        for(int i=0; i < 5; i++) {
//            for(int j=0; j <= i; j++) System.out.print("* ");
//            System.out.print("\n");
//        }
//
//        System.out.println(" *\n" + " * *\n" + " * * *\n" + " * * * *\n" + " * * * * *");
    }
}
