package 제네릭기본;

import java.util.ArrayList;
import java.util.List;

/*
Date : 2023-08-30
Author : J.H.Hwang
Purpose :  Generic를 설명하는 프로그램입니다.
 */
public class GenericBasic {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        String str = (String) list.get(0);
        System.out.println(str);

        // 제네릭 타입으로 변환
        List<String> list2 = new ArrayList<>();     // <타입변수> : 리스트에 값을 넣을때 타입변수의 타입만 들어간다.
        list2.add("java");
        String str2 = list2.get(0);
        System.out.println(str2);

    }
}
