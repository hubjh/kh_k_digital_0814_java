package 윤년계산하기;
/*
Date : 2023-08-16
Author : J.H.Hwang
Purpose : 윤년 계산 프로그램입니다.
 */

// - 연도가 4로 나누어 떨어진다.
// 100으로 나누어 떨어지면 연도는 윤년이 아니다.
// 400으로 나누어 떨어지면 윤년이다.

import java.util.Scanner;

public class ExampleTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력 하세요. : ");
        int year = sc.nextInt();

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            // 조건이 참인 경우 수행되는 구간
            System.out.println(year + "년도는 윤년 입니다.");
        } else {
            // 조건이 거짓인 경우 수행되는 구간
            System.out.println(year + "년도는 윤년 아닙니다.");
        }

    }
}
