package 접근제한자;
/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 접근 제한자를 설명하는 프로그램입니다.
 */
public class Parent {
    public String name;
    String money;   // default는 같은 패키지 내에 있어야 접근 허용
    protected String addr;
    public Parent() {
        name = "Parent";
        money = "100억";
        addr = "서울시 강남구 역삼동";
    }
}
