package 인터페이스활용;
/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose : 다중 인터페이스를 설명하기 위한 프로그램입니다.
 */
public interface Buy {
    void buy();
}
interface Sell {
    void sell();
}

class Cutsomer implements Buy, Sell {

    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }
}