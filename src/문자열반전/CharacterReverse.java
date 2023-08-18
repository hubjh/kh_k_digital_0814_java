package 문자열반전;
/*
Date : 2023-08-18
Author : J.H.Hwang
Purpose : 문자열을 입력받으면 반전시켜 출력하는 알고리즘 문제 프로그램입니다.
 */
import java.util.Scanner;

public class CharacterReverse {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자열을 입력하세요 : ");
//        String str = sc.nextLine();
//        System.out.print("");
//        int sum = 0;
//        int len = str.length();
//        System.out.println("반전된 문자열은");
//
//        for (int i = len-1; i >= 0; i--) {
//            char ch = str.charAt(i);
//            System.out.print(ch);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력 : ");
        String input = sc.nextLine();
        int pos = input.length() - 1;   // 문자열의 시작 위치(반전된 위치)
        while(pos > -1) {
            System.out.print(input.charAt(pos));
            pos--;
        }



    }
}

