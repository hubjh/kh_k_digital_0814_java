package 트리셋;

import java.util.TreeSet;

/*
Date : 2023-08-31
Author : J.H.Hwang
Purpose :  TreeSet을 설명하는 프로그램입니다.
 */
// 검색 기능을 강화 시킨 자료 구조에서 사용 된다.
// 데이터가 저장될 때 이진 검색 트리 형태로 저장되고, 값을 검색할 때 inOrder(Left -> Root -> Right) 방식으로 탐색 함
public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        ts.add(56);
        for(Integer e: ts) System.out.print(e + " ");
    }
}
