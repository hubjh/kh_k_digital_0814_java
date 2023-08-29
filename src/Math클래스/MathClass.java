package Math클래스;
/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose :  Math 클래스를 설명하는 프로그램입니다.
 */
// Math 클래스는 수학에서 자주 사용하는 상수들과 함수를 미리 구현 해 놓은 클래스
// Math 클래스의 모든 메소드는 static 이므로, 객체 생성없이 바로 사용
// java.lang 패키지에 포함되어 있어 import 가 필요 없음
// random() 메소드는 0.1 ~ 1미만의 임의의 double형 값을 반환
public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.random() * 100);    // 0 ~ 99
    }
}
