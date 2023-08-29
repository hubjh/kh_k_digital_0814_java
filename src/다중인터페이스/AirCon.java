package 다중인터페이스;
/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose : 다중 인터페이스를 설명하기 위한 프로그램입니다.
 */
public interface AirCon {
    int MAX_TEMP = 30;  // public final static
    int MIN_TEMP = 0;
    void airConON();
    void airConOFF();
    void setAirConTemp(int tmp);
}
