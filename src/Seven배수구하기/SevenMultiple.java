package Seven배수구하기;
/*
Date : 2023-08-18
Author : J.H.Hwang
Purpose : 기본 알고리즘 문제로 1 ~ 1000사이의 7의 배수를 구하고 한줄에 10개 항목씩 출력 하는 프로그램입니다.
 */
public class SevenMultiple {
    public static void main(String[] args) {
//
//        for(int i = 1; i <= 1000; i++) {
//            if (i % 7 == 0) {
//                System.out.printf("%5d",i);
//                if (i % 70 == 0) System.out.println();
//            }
//        }

        int cnt = 0;
        for(int i = 7; i <= 1000; i+=7) {
            cnt++;
            System.out.printf("%5d", i);
            if(cnt == 10) {
                System.out.println();
                cnt = 0;
            }
        }
    }
}
