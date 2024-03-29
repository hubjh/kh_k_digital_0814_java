package 중첩인터페이스;
/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose :  자바 중첩 인터페이스를 설명하는 프로그램입니다.
 */
// 중첩 인터페이스는 클래스 내부에 선언한 인터페이스 입니다.
// 중첩 인터페이스는 주로 UI 프로그래밍에서 이벤트 처리를 목적으로 사용
public class DoubleInterface {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setOnClickListener(new CallListener());
        btn.touch();
        btn.setOnClickListener(new MessageListener());
        btn.touch();
    }
}
