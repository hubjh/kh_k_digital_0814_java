package 디폴트메소드중복;
/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose : 인터페이스의 디폴트 메소드를 설명하기 위한 프로그램입니다.
 */
public interface Buy {
    void buy();     // public abstract 자동으로 추가 됨
    default void order() {  // 예외적으로 구현부를 가짐
        System.out.println("구매 주문");
    }
}

interface Sell {
    void sell();
    default void order() {
        System.out.println("판매 주문");
    }
}

class Customer implements Buy, Sell {

    @Override
    public void buy() {

    }

    @Override
    public void order() {
        Buy.super.order();
        Sell.super.order();
    }

    @Override
    public void sell() {

    }
}