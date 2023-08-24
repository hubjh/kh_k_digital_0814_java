package 다형성기본;
/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 상속을 활용한 TV 만들기 프로그램입니다.
 */
public class Child extends Parent {
    private int x = 100;
    public Child() {}       // 생성자도 메소드다
    public void out() {
        System.out.println("부모의 protected num 필드 : " + money);
        System.out.println("자식 클래스 메소드");
    }

    @Override
    public void display() {
        System.out.println("상속 받아 재정의한 메소드");
    }
}
