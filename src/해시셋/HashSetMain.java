package 해시셋;

import java.util.Arrays;
import java.util.HashSet;

/*
Date : 2023-08-31
Author : J.H.Hwang
Purpose :  HashSet을 설명하는 프로그램입니다.
 */
// 중복 허용 하지 않음, 순서 보장 하지 않음, 수학의 집합과 유사한 개념
public class HashSetMain {
    public static void main(String[] args) {
//        String[] arr = {"H", "e", "l", "l", "o"};
//        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
////        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
//        System.out.println(set);
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("JavaScript");
        set.add("Java");    // add 안 됨
        for(String e : set) System.out.print(e + " ");
    }
}
