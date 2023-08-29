package 다중인터페이스;
/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose : 다중 인터페이스를 설명하기 위한 프로그램입니다.
 */
public class Car {
    protected int speed;    // 상속 관계가 성립되면 접근 가능
    protected String color;
    protected String year;
    public Car() {
        speed = 150;
        color = "white";
        year = "1999";
    }
}
