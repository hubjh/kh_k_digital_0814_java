package 계산기만들기;

import java.util.Scanner;

/*
Date : 2023-08-17
Author : J.H.Hwang
Purpose : 스위치문을 활용한 간단한 계산기 프로그램입니다.
 */
public class CalcSwitch {
    public static void main(String[] args) {
        int x, y;   // 좌변과 우변
        char op;    // 연산자
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();   // 줄바꿈이나 공백이 오면 x에 데이터를 넘겨줌
        System.out.println("x : " + x);
        op = sc.next().charAt(0);  // 줄바꿈이나 공백이 오면 op에 데이터를 넘겨줌
        System.out.println("op : " + op);
        y = sc.nextInt();   // 줄바꿈이나 공백이 오면 y에 데이터를 넘겨줌
        System.out.println("y : " + y);
        switch (op) {
            case '+' :
                System.out.println("덧셈 : " + (x + y));
                break;
            case '-' :
                System.out.println("뺄셈 : " + (x - y));
                break;
            case '*' :
                System.out.println("곱셈 : " + (x * y));
                break;
            case '/' :
                System.out.println("나눗셈 : " + ((double)x / y));
                break;
            default:
                System.out.println("연산자를 잘 못 입력 하셨습니다.");
        }
    }
}
