package 매개변수의다형성1;
/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 매개변수 다형성을 설명하는 첫번째 프로그램입니다.
 */
public class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product p) {   // 구매에 대한 메소드, 부모 클래스의 참조 변수로 자식 객체를 접근 함 // 자식 인스턴스들이 전부 들어 올 수 있다 (다형성 장점)
        money -= p.price;
        bonusPoint += p.bonusPoint;
    }
    void viewInfo() {
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + bonusPoint);
    }
}
