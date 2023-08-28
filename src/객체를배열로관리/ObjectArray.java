package 객체를배열로관리;

import java.util.Scanner;

/*
Date : 2023-08-28
Author : J.H.Hwang
Purpose : 객체 배열을 설명하기 위한 프로그램입니다.
 */
public class ObjectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 인원 : ");
        int cnt = sc.nextInt();
        NameCard[] nameCards = new NameCard[cnt];
        System.out.println("-".repeat(5) + "정보 입력" + "-".repeat(5));
        for(int i = 0; i <nameCards.length; i++) {
            nameCards[i] = new NameCard();
            System.out.print("이름 : ");
            nameCards[i].setName(sc.next());
            System.out.print("나이 : ");
            nameCards[i].setAge(sc.nextInt());
            System.out.print("연락처 : ");
            nameCards[i].setPhone(sc.next());
            System.out.print("메일 : ");
            nameCards[i].setMail(sc.next());
        }
        for(NameCard card : nameCards) {    // 데이터 타입 / 요소 : 배열 이름
            card.printInfo();
        }
    }
}
