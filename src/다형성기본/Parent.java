package 다형성기본;
/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 상속을 활용한 TV 만들기 프로그램입니다.
 */
public class Parent {
    protected int money = 1000000000;  // 상속 관계와 같은 패키지내에서 접근 가능
    public void display() {
        System.out.println("부모 클래스 메소드");
    }
}
