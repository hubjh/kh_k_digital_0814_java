package 매개변수의다형성1;

import java.util.Scanner;

/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 매개변수 다형성을 설명하는 첫번째 프로그램입니다.
 */
public class BuyerEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        TV tv = new TV();
        Computer computer = new Computer();
        Audio audio = new Audio();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("[1]TV [2]Computer [3]Audio [4]quit : ");
            int sel = sc.nextInt();
            switch (sel) {
                case 1 :
                    buyer.buy(tv);
                    buyer.viewInfo();
                    break;
                case 2 :
                    buyer.buy(computer);
                    buyer.viewInfo();
                    break;
                case 3 :
                    buyer.buy(audio);
                    buyer.viewInfo();
                    break;
                case 4 : return;
                default: System.out.println("해당 제품이 없습니다.");
            }
        }


    }
}
