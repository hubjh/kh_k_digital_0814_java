package 영화표예매;

import java.util.Scanner;

/*
Date : 2023-08-23
Author : J.H.Hwang
Purpose : 간단한 영화표 예매 시스템을 만드는 프로그램입니다.
 */
public class MovieTicket {
    // 좌석의 개수
    int[] seat = new int[10];   // 인스턴스 필드

    int ticketPrice;
    MovieTicket(int price) {
        ticketPrice = price;
    }
    // 판매된 좌석의 개수를 확인 총 판매 금액을 구해서 반환
    int totalAmount() {
        int cnt = 0;    // 지역 변수
        for(int val : seat) {   // val 이라는 변수는 seat 배열을 처음 부터 마지막 까지 순회 하는 요소
            if(val == 1) cnt++;
        }
        return cnt * ticketPrice; // 반환값이 int형
    }
    void printSeat() {  // 선택 가능한 좌석의 리스트를 보여 줌
        for (int s : seat) {
            if (s == 0) System.out.print("[ ]");   // 판매가 안 된 좌석
            else System.out.print("[V]");        // 이미 판매가 된 좌석을 의미
        }
        System.out.println();
    }

    void selectSeat() {     // 좌석을 판매하는 메뉴
        printSeat();    // 좌석 상태를 보여주는 메소드 호출
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석을 선택 하세요 : ");
        int selSeat = sc.nextInt(); // 유저가 선택한 좌석을 입력 받음(유저는 1부터 생각함..)
        if (seat[selSeat - 1] == 0) {    // 유저가 선택한 좌석이 판매 되었는지 확인
            seat[selSeat - 1] = 1;  // 판매가 안 된 좌석이기 때문에 판매 함
            printSeat();    // 판매 이 후에 좌석 상태를 다시 보여 줌
        } else System.out.println("이미 판매 된 좌석 입니다. \n 다른 좌석을 선택하세요.");
    }
}
