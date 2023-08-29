package 인터페이스활용;
/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose : 인터페이스를 설명하기 위한 프로그램입니다.
 */
public class InterfaceEx {
    public static void main(String[] args) {
        Cutsomer cutsomer = new Cutsomer();
        Buy buyer = cutsomer;   // customer 참조 변수를 Buy 인터페이스형에 대입
        buyer.buy();

        Sell seller = cutsomer;
        seller.sell();
        Cutsomer cutsomer2 = (Cutsomer) seller; // 다운 캐스팅 (형변환)
        cutsomer2.buy();
        cutsomer2.sell();
    }
}
