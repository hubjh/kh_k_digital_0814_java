package 싱글톤;
/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 싱글톤을 설명하는 프로그램입니다.
 */
public class Singleton {
    String name;
    int id;
    // 클래스 내에서 단 한번 딱 한번 객체를 생성 함
    private static Singleton singleton = new Singleton();
    // 생성자를 외부에서 호출 되지 않도록 접근 제한을 함
    private Singleton() {
        name = "test";
        id = 100;
    }
    // 한번 만들어진 객체에 대한 주소를 반환 함
    static Singleton getSingleton() {
        return singleton;
    }
}
