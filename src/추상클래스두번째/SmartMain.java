package 추상클래스두번째;
/*
Date : 2023-08-25
Author : J.H.Hwang
Purpose : 추상 클래스를 설명하는 프로그램입니다.
 */
public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone Pro 14");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();

        Phone phone = new Phone("목업") {
            @Override
            void call() {
                System.out.println("목업폰이라 통화가 안되요 ㅠㅠ");
            }
        };
        phone.call();
    }
}
