package 컴페어레이터;

import java.util.TreeSet;

/*
Date : 2023-08-31
Author : J.H.Hwang
Purpose :  Comparator을 설명하는 프로그램입니다.
 */
//  두 개의 메소드를 비교하는 방법
public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> set = new TreeSet<>(new DescendComparator().reversed());     // .reversed() 역순으로 된다.
        set.add(new Fruit("포도", 3000));
        set.add(new Fruit("수박", 10000));
        set.add(new Fruit("딸기", 6000));
        for(Fruit e : set) System.out.println("과일 이름 : " + e.name + ", 가격 : " + e.price);
    }
}
