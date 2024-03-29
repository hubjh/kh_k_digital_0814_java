package 단어정렬하기;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

/*
Date : 2023-08-31
Author : J.H.Hwang
Purpose :  알파벳을 특정 조건 순서대로 정렬하는 프로그램입니다.
 */
// 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
// n의 개수를 먼저 입력 받음
// 1. 길이가 짧은 것 부터
// 2. 길이가 같으면 사전 순으로
// 3. 중복 제거
public class WordSortEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // n의 개수 입력 받기
        String[] word = new String[n];
        for(int i = 0; i < word.length; i++) {
            word[i] = sc.next();
        }
//        for(String e : word) System.out.println(e);

        // 입력 받은 문자열 배열의 중복 제거를 위해 set 컬렉션에 넣음
        HashSet<String> set = new HashSet<>(Arrays.asList(word));
        // 다시 배열로 되돌림, 원래 생성된 크기 만큼 되돌림
        word = set.toArray(new String[0]);

        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();   // 만약 앞이 길면 양수
                }
            }
        });
        System.out.println(Arrays.toString(word));
    }
}
