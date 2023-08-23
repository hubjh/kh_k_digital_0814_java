package 객체타입확인;
/*
Date : 2023-08-23
Author : J.H.Hwang
Purpose : instanceof를 설명하기 위한 프로그램입니다.
 */
// instanceof : 상속 관계가 성립하는지 확인하는 용도
// 왼쪽 피연사자가 오른쪽 피연사자의 인스턴스인지를 검사하며,
// 결과는 불리언 값(true 또는 false)으로 반환됩니다.
public class InstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");
        System.out.println(parent instanceof Parent);   // true
        System.out.println(child instanceof Parent);    // true
        System.out.println(parent instanceof Child);    // false
        System.out.println(child instanceof Child);     // true

    }
}

class Parent {
    String name;
    Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent {
    Child(String name) {
        super("부모");    // 자식 클래스를 만들때 부모의 name을 초기화를 안했기 때문에 super로 부모 생성자를 초기화해준다
        this.name = name;
    }
}
