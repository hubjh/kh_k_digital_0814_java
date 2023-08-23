package 상속기본;
/*
Date : 2023-08-23
Author : J.H.Hwang
Purpose : 오버로딩 설명 프로그램입니다.
 */
public class Animal {       // 클래스 내에 퍼블릭 클래스는 하나여만 한다.
    String name;
    void setName(String name) {
        this.name = name;
    }
}

// Animal을 상속 받아 Dog 클래스를 만듬
class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
    void sleep() {      // 기존의 특성(sleep)을 재정의 함
        System.out.println(this.name + " zzz in house");
    }
    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");

    }
}
