package 열거타입2;
/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose :  Enum을 설명하는 프로그램입니다.
 */
public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("곰돌이사육사", DevType.BIGDATA, Career.JUNIOR, Gender.MALE);
        developer.devInfo();

    }
}
