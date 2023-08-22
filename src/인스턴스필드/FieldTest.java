package 인스턴스필드;
/*
Date : 2023-08-22
Author : J.H.Hwang
Purpose : 인스턴스 필드를 만들어보는 프로그램입니다.
 */
public class FieldTest {
    static int classVal = 10;   //  클래스 변수 선언, 정적 변수, 메소드 영역에 저장, 단 한번만 생성
    int instanceVal = 20;       //  인스턴스 변수 선언, 동적 변수, 힙 영역에 저장, 객체가 만들어 질 때 마다 생성
}
