package 상속기본;
/*
Date : 2023-08-23
Author : J.H.Hwang
Purpose : 상속에 대한 설명 프로그램입니다.
 */
// 상속 : 자식 킄래스가 부모 클래스의 기능을 물려 받는 것 (Field 와 Method)
// 키워드는 extends
public class InheritanceEx {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.setName("poppy");
//        dog.sleep();

        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep(10);
    }
}
