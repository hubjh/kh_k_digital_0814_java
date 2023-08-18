package 숫자의합;
/*
Date : 2023-08-18
Author : J.H.Hwang
Purpose : N개의 숫자의 합을 출력하는 알고리즘 문제 프로그램입니다.
 */

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
//        String str = "567";
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 문자열을 입력하세요 : ");
        String str = sc.next();
        System.out.print("");
        int sum = 0;

        for (int i = 0;i < str.length(); i++) {
            char ch = str.charAt(i);
            sum += (ch -'0');
        }
        System.out.println(sum);
    }
}

//        int n = 5;
//        int sum = 0;
//        for(;n > 0; n--) {
//            System.out.printf("%d",n);
//            sum += n;
//        }
//        System.out.println('\n');
//        System.out.print(sum);

//    }
//}
