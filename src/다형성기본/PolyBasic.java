package 다형성기본;
/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 상속을 활용한 TV 만들기 프로그램입니다.
 */
public class PolyBasic {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        child.out();
        child.display();
        parent.display();

        Parent p = new Child(); // 부모 클래스의 참조 변수로 자식 객체를 접근 함    부모(num,display) -> 자식(num,display,out)
        p.display(); // display() 어느게 불려질까???(자식 것이 불러진다) // 오버 라이딩이 일어나 자식 메소드가 호출 됨 // (num, display)


    }
}

