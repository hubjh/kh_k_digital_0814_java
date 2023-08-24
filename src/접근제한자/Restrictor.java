package 접근제한자;
/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 접근 제한자를 설명하는 프로그램입니다.
 */
public class Restrictor {
    public void seoul() {
        System.out.println("서울에 대한 메소드 입니다.");
    }
    protected void busan() {
        System.out.println("부산에 대한 메소드 입니다.");
    }
    void deagu() {
        System.out.println("대구에 대한 메소드 입니다.");
    }
    private void  inchun() {
        System.out.println("인천에 대한 메소드 입니다.");
    }
}
