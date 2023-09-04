package 매개변수람다식;
/*
Date : 2023-09-04
Author : J.H.Hwang
Purpose :  함수형 프로그래밍을 설명하는 프로그램입니다.
 */
@FunctionalInterface    // 함수형 프로그램을 만들기 위한 어노테이션, 내부에 함수가 '한개 만' 존재
interface MyFuncInterface { // 자바의 메소드는 단독으로 존재할 수 없기때문에 불가피하게 생성하는 함수형 프로그래밍을 위한 인터페이스
    void method(int x);
}
@FunctionalInterface    // 리턴 값이 있는 람다식
interface MyFuncInterface2 {
    int min(int x, int y);
}
public class LambdaEx1 {
    public static void main(String[] args) {
//        MyFuncInterface fi  = x -> {    // 매개변수가 한개인 경우는 () 생략 가능
//            int result = x * 5;
//            System.out.println(result);
//        };
//        fi.method(10);

        MyFuncInterface2 fi2 = (x, y) -> x < y ? x : y;     // 구현부가 한 줄인 경우 {} 생략 가능 return 생략
        System.out.println(fi2.min(3, 4));
    }
}
