package 메소드참조;

import java.util.function.IntBinaryOperator;

/*
Date : 2023-09-04
Author : J.H.Hwang
Purpose :  메소드 참조를 설명하는 프로그램입니다.
 */
// 메소드 참조(method reference)는 메소드를 참조해서 매개 변수의 정보 및 리턴 타입을 알아 내어, 불 필요한 매개 변수를 제거하는 것이 목적
class Calculator {
    public static int staticMethod(int x, int y) {
        return x + y;
    }
    public static int instanceMethod(int x, int y) {
        return x + y;
    }
}
public class MethodRef {
    public static void main(String[] args) {
        // 두 개의 정수 값을 받아 연산을 수행한 결과를 반환하는 메소드를 정의 하기 위해 사용
        IntBinaryOperator operator;
        // 람다식 사용 방법
        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과 1 : " + operator.applyAsInt(1, 2));
        // 정적 메소드 참조
        operator = Calculator::staticMethod;
        System.out.println("결과 2 : " + operator.applyAsInt(3, 4));

        operator = Calculator::instanceMethod;
        System.out.println("결과 3 : " + operator.applyAsInt(5, 6));
    }
}
