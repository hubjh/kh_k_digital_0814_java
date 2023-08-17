package 세자리정수중큰수찾기;
/*
Date : 2023-08-17
Author : J.H.Hwang
Purpose : 연습문제2 프로그램입니다.
 */

import java.util.Scanner;

public class IntBigNumber {
    public static void main(String[] args) {
        int num;    // 100의 자리 정수 입력을 받기 위한 변수
        int a, b, c, tmp;    // 100, 10 1의 자리 값을 담기 위한 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("100의 자리 정수 입력 : ");
        num = sc.nextInt();
        a = num / 100;  // 100으로 나눈 몫을 담음
        b = (num % 100) / 10;   // 100으로 나눈 나머지를 다시 10을 나누어서 담음
        c = num % 10;   // 10으로 나눈 나머지를 담음


        tmp = ( Math.max(a,b) );  // 26
        System.out.println( Math.max(tmp,c) );  // Math.max 사용하면 둘 중 큰 값을 얻을 수 있다.

    }
}

//        if(a > b) {
//            if(a > c) System.out.println(a);
//            else System.out.println(c);
//        } else {
//            if(b > c) System.out.println(b);
//            else System.out.println(c);
//        }


//    }
//}
