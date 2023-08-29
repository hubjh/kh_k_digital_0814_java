package 클론오브젝트;
/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose :  클론 메소드를 설명하는 프로그램입니다.
 */
public class CloneObject {
    public static void main(String[] args) {
        Member mem1 = new Member("bear", "곰돌이사육사", "123456", 20, true);
        Member mem2 = mem1.getMember();     // 얕은 복사가 일어나는 조건
        mem1.viewInfo();
        mem2.name = "KH정보교육원;";
        mem2.password = "KKKKKKKK";
        mem2.viewInfo();
        mem1.viewInfo();
    }
}
