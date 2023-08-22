package 인스턴스필드;
/*
Date : 2023-08-22
Author : J.H.Hwang
Purpose : 인스턴스 필드를 만들어보는 프로그램입니다.
 */
public class InstanceField {
    public static void main(String[] args) {
        int val = 30;   // 지역 변수
        FieldTest fieldTest1 = new FieldTest();
        fieldTest1.instanceVal = 200;   // 각각의 객체 마다 값을 다르게 설정 할 수 있음
        FieldTest fieldTest2 = new FieldTest();
        fieldTest2.instanceVal = 300;

        FieldTest.classVal = 1000;
    }
}
