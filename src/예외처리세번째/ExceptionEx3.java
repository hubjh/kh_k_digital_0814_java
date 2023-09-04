package 예외처리세번째;
/*
Date : 2023-09-04
Author : J.H.Hwang
Purpose :  예외처리를 설명하는 프로그램입니다.
 */
//NullPointerException (NPE) : Java에서 발생하는 대표적인 런타임 에러 입니다. 참조 하려는 객체가 없는 경우에 발생 합니다.
public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;
//        try {
//            String testStr = test.name;
//            System.out.println(testStr);
//        } catch (NullPointerException e) {
////            System.out.println("NPE가 발생 했습니다.");
//        }

        if(test != null) {
            String testStr = test.name;
            System.out.println(testStr);
        } else {
            System.out.println("test가 null 입니다.");
        }
    }
}

class Test {
    String name = "곰돌이사육사";
}
