package KMP;
/*
Date : 2023-08-23
Author : J.H.Hwang
Purpose : KMPEx 프로그램입니다.
 */

import java.util.Scanner;
// Knuth-Morris-Pratt => KMP
// Mirko-Slavko => MS
// split("-")를 이용하해서 문자열을 자르고 자른 문자열의 0번째 인덱스를 선택하는 방법
// 0번째 선택, "-"다음의 문자 선택
// 대문자만 골라냄(charAt(인덱스), toCharArray())
public class KMPEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String name = sc.next();

        //======== 내가 푼 것 =============
//        String[] splitTest = name.split("-");
//        for (String e : splitTest) {
//            System.out.print(e.charAt(0));
//        }

        // 1. charAt(인덱스)
        for(int i = 0; i < name.length(); i++) {
            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') System.out.print(name.charAt(i));
        }
        System.out.println();
        // 2. 첫 번째 문자 선택, '-' 다음의 문자 선택
        for(int i = 0; i < name.length(); i++) {
            if(i == 0) System.out.print(name.charAt(i));
            else {
                if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
            }
        }
        System.out.println();

        // 3. split()메소드를 이용하는 방법
        String[] splitName = name.split("-");
        for(String e : splitName) System.out.print(e.charAt(0));

        System.out.println();

        // 4. toCharArray() : 문자열을 문자 배열로 변경
        char[] chName = name.toCharArray();     // 문자열을 문자 배열로 변환
        for(char ch : chName) {
            if(ch >= 'A' && ch <= 'Z') System.out.print(ch);
        }
    }
}
