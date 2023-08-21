package 대소문자바꾸기;

import java.util.Scanner;

/*
Date : 2023-08-21
Author : J.H.Hwang
Purpose : 대소문자를 바꾸는 프로그램입니다.
 */
public class UpperLowerChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
//        char ch = 'a', ch2 = 'z', ch3 = 'A';
//        System.out.println((char)(ch3 +32));
        for(int i=0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if (tmp >= 'A' && tmp <='Z') System.out.print((char)(tmp + ('a'- 'A')));
            if (tmp >= 'a' && tmp <='z') System.out.print((char)(tmp - 32));
        }
    }
}
