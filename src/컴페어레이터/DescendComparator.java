package 컴페어레이터;

import java.util.Comparator;

/*
Date : 2023-08-31
Author : J.H.Hwang
Purpose :  Comparator을 설명하는 프로그램입니다.
 */
public class DescendComparator implements Comparator<Fruit> {
    @Override
    public Comparator<Fruit> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price < o2.price) return 1;
        else if(o1.price == o2.price) return 0;
        else return -1;
    }


}
