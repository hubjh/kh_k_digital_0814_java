package 요금제계산하기;
/*
Date : 2023-08-22
Author : J.H.Hwang
Purpose : 핸드폰 요금제를 계산하는 코딩 테스트 프로그램입니다.
 */

// 영식 요금제 : 30초당 10원 (30초가 되면 2통이 됨)
// 민식 요금제 : 50초당 15원
// 첫번째 줄에 통화의 횟수(20회 미만), 두번째 줄에 통화당 통화 시간(초단위)
// 출력은 싼 요금제를 출력 영식 요금제는 Y, 민식 요금제는 M
// 총 통화 요금이 같은 경우는 YM 총 통화 요금은 표시

import java.util.Scanner;

public class PaymentSystem {
    public static void main(String[] args) {
        int[] call = new int[20];   // 통화 횟수에 대한 통화 시간을 입력 받기 위한 배열
        int yPay = 0, mPay = 0;
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();     // 통화 횟수를 입력 받아 변수에 대입
        for(int i = 0; i < cnt; i++) {  // 통화 횟수 당 통화 시간을 입력 받음
            call[i] = sc.nextInt();
        }
        // 총 통화 요금 구하기
        for(int i = 0; i < cnt; i++) {
            yPay += (call[i] / 30) * 10 + 10;
            mPay += (call[i] / 60) * 15 + 15;
        }
        if(yPay > mPay) {
            System.out.println("M " + mPay);
        } else if (yPay < mPay) {
             System.out.println("Y " + yPay);
        } else {
            System.out.println("YM " + yPay);
        }
    }
}
