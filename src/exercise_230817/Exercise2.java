package exercise_230817;

import java.util.Scanner;

/*
Date : 2023-08-17
Author : J.H.Hwang
Purpose : 연습문제2 프로그램입니다.
 */
public class Exercise2 {
    public static void main(String[] args) {
        int x, y, z, tmp, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요. : ");
        x = sc.nextInt();
        System.out.print("두번째 숫자를 입력해주세요. : ");
        y = sc.nextInt();
        System.out.print("세번째 숫자를 입력해주세요. : ");
        z = sc.nextInt();

        if (x == y) {
            tmp = x;
        } else if (x > y) {
            tmp = x;
        } else {
            tmp = y;
        }

        if (tmp == z) {
            System.out.printf("%d", tmp);
        } else {
            boolean isBigger = (tmp > z) ? true : false;
            if (isBigger) {
                System.out.printf("%d", tmp);
            } else {
                System.out.printf("%d", z);
            }
        }
    }
}
