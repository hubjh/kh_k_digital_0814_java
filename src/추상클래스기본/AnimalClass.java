package 추상클래스기본;
/*
Date : 2023-08-25
Author : J.H.Hwang
Purpose : 추상 클래스를 설명하는 프로그램입니다.
 */
// 추상 클래스는 클래스 앞에 abstract 키워드를 붙여서 만듬
// 추상 클래스는 객체화 안됨
// 내부에 0개 이상의 추상 메소드가 포함되어 있음
// 추상 메소드는 상속 받는 클래스에서 오버라이딩 해줘야 함(해당 메소드의 기능을 구체화 시킴)
public abstract class AnimalClass {
    abstract void cry();    // 추상 메소드 : 상속 받은 클래스에서 구체화를 해줘야 함
    void sleep() {
        System.out.println("zzzzz");
    };

}

class Cat extends AnimalClass {
    @Override
    void cry() {
        System.out.println("냐옹냐옹!!!");
    }

    @Override
    void sleep() {
        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
    }
}

class Dog extends AnimalClass {

    @Override
    void cry() {
       System.out.println("멍멍멍멍멍멍멍!!!");
    }
}