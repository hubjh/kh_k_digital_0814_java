package 스트링토커나이저;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
Date : 2023-08-30
Author : J.H.Hwang
Purpose :  String Tokernizer를 설명하는 프로그램입니다.
 */
// 문자열이 특정 문자열로 연결되어 있는 경우, 구분자를 기준으로 부분 문자열로 만듬 (split() 용도가 같음)
// countTokens() : 꺼내지 않고 남아 있는 토큰의 수
// hasMoreTokens() : 남아 있는 토큰이 있는지 여부 확인
// nextToken() : 토큰을 하나씩 꺼내 옴
public class StringToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력 하세요 : ");
        String names = sc.nextLine();

//        StringTokenizer st = new StringTokenizer(names, "/");
//        String[] nameStr = new String[st.countTokens()];
//        int idx = 0;
//        while (st.hasMoreTokens()) {
//            nameStr[idx++] = st.nextToken();
//        }

        String[] nameStr = names.split("/");
        for(String e : nameStr) System.out.print(e + " ");

//        //  class
//        String s = new String();
//        Class c = s.getClass();
//        System.out.println(c);
    }
}
