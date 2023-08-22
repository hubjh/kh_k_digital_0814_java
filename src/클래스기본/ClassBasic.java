package 클래스기본;
/*
Date : 2023-08-22
Author : J.H.Hwang
Purpose : 기본적인 클래스를 만들어보는 프로그램입니다.
 */
public class ClassBasic {
    public static void main(String[] args) {
        Student s1 = new Student();     // new 동적 할당, 인스턴스화  <클래스> <참조변수> = <동적할당됨>
        System.out.println(s1.setName("곰돌이사육사"));
        s1.setAddr("경기도 수원시");
        s1.showInfo();

        Student s2 = new Student();
        s2.setName("황준호");
        s2.setAddr("경기도 남양주시");
        s2.showInfo();

        Student s3 = new Student();
        s3.setName("너구리");
        s3.setAddr("대한민국");
        s3.showInfo();
    }
}
