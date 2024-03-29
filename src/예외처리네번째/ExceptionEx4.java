package 예외처리네번째;

import java.util.Scanner;

/*
Date : 2023-09-04
Author : J.H.Hwang
Purpose :  예외처리를 설명하는 프로그램입니다.
 */
// ArithmeticException
public class ExceptionEx4 {
    public static void main(String[] args) {
        int rst = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("나눗셈 입력 : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                rst = a / b;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력 하세요.");
                continue;
            } finally {     // 예외에 상관없이 무조건 수행되는 구문 입니다.
                System.out.println("결과 : " + rst);
                break;
            }

        }
    }
}
