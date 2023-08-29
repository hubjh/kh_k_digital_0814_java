package Object클래스;
/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose :  Object class를 설명하는 프로그램입니다.
 */
// toString() : 해당 인스턴스에 대한 정보를 문자열로 반환
// 클래스이름@해시코드 (객체의 메모리 주소를 이용해 해시 코드 생성) // 객체의 메모리 주소 -> [Hash function] -> 해시 코드
// toString() 메소드는 오버라이딩해서 사용 가능하며 String, Integer의 경우에는 오버라이딩 되어 있다.
public class ObjectClass {
    public static void main(String[] args) {
        Car car01 = new Car();
//        Car car02 = new Car();    // false
//        System.out.println(car01.toString());
//        System.out.println(car02.toString());
//        String test = "곰돌이사육사";
//        Integer test2 = 2300;
//        int test3 = 4500;
//        System.out.println(test.toString());
//        System.out.println(test2.toString());
        Car car02 = car01;          // true

        // equals() 메소드 : 인스턴스를 매개변수로 전달받는 참조변수와 비교하여 그 결과를 반환
        System.out.println(car01.equals(car02));
    }
}

class Car {

}
