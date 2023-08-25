package 추상클래스두번째;
/*
Date : 2023-08-25
Author : J.H.Hwang
Purpose : 추상 클래스를 설명하는 프로그램입니다.
 */
public class SmartPhone extends Phone {     // 추상 클래스를 상속 받아서 사용
    public SmartPhone(String name) {
        super(name);    // 부모의 생성자 호출
    }

    @Override
    void call() {   // 추상 메소드를 오버라이드 함
        System.out.println("부모 클래스의 call() 메소드를 구체화 함, 통화 기능 완성");
    }
    public void internet() {
        System.out.println("인터넷을 검색 합니다.");
    }
}
