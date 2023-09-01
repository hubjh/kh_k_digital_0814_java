package 전자레인지;

import java.util.Scanner;

/*
Date : 2023-09-01
Author : J.H.Hwang
Purpose :  전자레인지를 만드는 예제 프로그램입니다.
 */
// 3개의 시간조절용 버튼 A B C , 버튼 A, B, C에 지정된 시간은 각각 5분, 1분, 10초이다.
public class Microwave {
    public static void main(String[] args) {
        // 3개의 버튼 A : 5분 , B : 1분 , C : 10초
        final int a = 300;
        final int b = 60;
        final int c = 10;
        // 시간 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("조리할 시간을 눌러 주세요 : ");
        int targetTime = sc.nextInt();

        // 최단 버튼 횟수 계산 : 몫 , 나머지
        int aCnt = targetTime / a;
        targetTime = targetTime % a;
        int bCnt = targetTime / b;
        targetTime = targetTime % b;
        int cCnt = targetTime / c;
        targetTime = targetTime % c;

        // 딱 맞게 떨어지는 시간과 아닌 시간 구분해서 출력
        if (targetTime > 0) {
            System.out.println("-1\na : " + aCnt + "\nb : " + bCnt + "\nc : " + (cCnt));
        } else System.out.println("a : " + aCnt + "\nb : " + bCnt + "\nc : " + (cCnt));

        System.out.println("total : " + (aCnt + bCnt + cCnt));


//        ================= 강사님이 푼 것 =======================
//        int t, a, b, c; // 요리 시간을 초로 입력, a = 5분 , b = 1분 , c = 10초
//        Scanner sc = new Scanner(System.in);
//        t = sc.nextInt();
//        if(t % 10 != 0) {
//            System.out.println("-1");
//            return;
//        }
//        a = t / 300;    // 5분 버튼에 대한 몫 (5분 버튼이 눌려진 수)
//        b = t % 300 / 60;   // 1분 버튼이 눌려진 수
//        c = t % 300 % 60 / 10;  // 10초 버튼이 눌려진 수
//        System.out.printf("%d %d %d\n", a,b,c);
    }
}
