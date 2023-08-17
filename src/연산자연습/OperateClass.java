package 연산자연습;

import java.util.Scanner;

/*
Date : 2023-08-16
Author : J.H.Hwang
Purpose : 연산자 설명 프로그램입니다.
 */
// 산술 연산자 : 사칙 연산(+,-,*,/)과 나머지 연산자(%)
public class OperateClass {
    public static void main(String[] args) {
        int num1 = 10, num2 = 4;
//        System.out.println("덧셈 : " + (num1 + num2));
//        System.out.println("뺄셈 : " + (num1 - num2));
//        System.out.println("곱셈 : " + (num1 * num2));
//        System.out.println("나눗셈 : " + ((double)num1 / num2));
//        System.out.println("나머지 : " + (num1 % num2));
//        System.out.println("몫 : " + (num1 / num2));

        // 대입 연산자 : 변수에 값을 대입하는 연산자( = ), 프로그램에서 = 같다라는 의미가 아니고 대입한다는 의미
//        System.out.println(num1 += 2); // 복합 대입 연산자 : num1 = num1 + 2;
//        System.out.println(num1 -= 2); // 복합 대입 연산자 : num1 = num1 - 2;
//        System.out.println(num1 *= 2); // 복합 대입 연산자 : num1 = num1 * 2;
//        System.out.println(num1 /= 2); // 복합 대입 연산자 : num1 = num1 / 2;

        // 증감 연산자 : 단항연산자, 피연산자의 값을 1증가 또는 1감소 시키는 연산자
//        System.out.println(++num1);     // 11
//        System.out.println(num1++);     // 11
//        System.out.println(num1);     // 12

//        int tmp = num1--;
//        System.out.println(tmp);    // 10
//        System.out.println(num1);   // 9

        // 비교 연산자 : 두 개의 연산자를 피 연산자를 비교해서 어느 쪽이 큰지를 판단
        int x = 10;
        int y = 20;
        boolean rst1, rst2, rst3;
//        System.out.println(x > y);  // false
//        System.out.println(x < y);  // true
//        System.out.println(x == y); // false
//        System.out.println(x != y); // true
//        System.out.println(x >= y); // false
//        System.out.println(x <= y); // true

        // 논리 연산자 : &&(AND 연산자 : 둘 다 참인 경우), || (OR 연산자 : 둘 중 하나가 참인 경우)
        // ! : (NOT 연산자 : 현재가 참이면 거짓, 거짓이면 참)

//
//        rst1 = (x > 0) && (x > y);  // false
//        rst2 = (x > 0) || (x > y);  // true
//        rst3 = !((x > 0) && (x < y));   // false
//        System.out.println(rst1 + " " + rst2 + " " + rst3);

        // 삼항연산자 : 3개의 피연산자를 필요로 하는 연산자?? 참과 거짓만 구분할 수 있는 조건에서 쓰임
        Scanner sc = new Scanner(System.in);    // 키보드로 입력 받기 위해
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();
        boolean isAdult = (age > 19) ? true : false;    // 삼항 연산자 반대로도 가능
        System.out.println(isAdult);

        // 문자열 결합 연산자
        System.out.println("Java" + 18.04 + 12);
        System.out.println(3 + 3.3+ "JDK");

        // 연산자 우선 순위 확인
        int val1 = 5, val2 = 5, val3 = 5;
        int result1, result2, result3;
        result1 = val1 + val2 * val3;   //30
        result2 = (val1 + val2) * val3; //50
        result3 = val1 + (++val2) * val3;   //35

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
