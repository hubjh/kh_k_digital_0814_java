package PC방알바;
/*
Date : 2023-08-23
Author : J.H.Hwang
Purpose : pc방 아르바이트 알고리즘 프로그램입니다.
 */

import java.util.Scanner;

// 인원 수
// 예약할 좌석 번호 100개
// 결과는 거절 횟수 출력
public class PcRoomWork {
    public static void main(String[] args) {
//        PcManagement pcManagement = new PcManagement();
//        pcManagement.receiveGuest();

        int[] pcRoom = new int[100];
        int rejectCnt = 0, seatNum;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 인원 수를 입력 받음
        for(int i = 0; i < num; i++) {
            seatNum = sc.nextInt();
            if(pcRoom[seatNum - 1] == 1) rejectCnt++;
            else pcRoom[seatNum - 1] = 1;
        }
        System.out.println(rejectCnt);
    }
}
