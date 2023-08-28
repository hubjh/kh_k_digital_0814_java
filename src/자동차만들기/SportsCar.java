package 자동차만들기;

/*
Date : 2023-08-28
Author : J.H.Hwang
Purpose : 상속을 이용한 자바 자동차 만들기 프로그램입니다.
 */
//### 스포츠카
//
//        - 연비 : 8km
//        - 속도 : 250km
//        - 연료 탱크 크기 : 30 리터
//        - 좌석수 : 2
//        - 차량이름은 생성자에서 입력 받아서 설정
//        - 부가기능 : 터보기능 (켜면 속도 20% 향상)
public class SportsCar extends Car {
    String carName;
    boolean turbo = false;

    SportsCar(String carName) {
        this.mileage = 8;
        this.speed = 250;
        this.capacity = 30;
        this.numSeats = 2;
        this.carName = carName;
    }

    public void setTurbo() {
        if (!turbo) {
            speed = (int) (speed * 1.2);
            System.out.println(carName + "의 터보기능을 켭니다.");
            turbo = true;
        }
    }

    @Override
    public void state() {
        System.out.println("=".repeat(5) + carName + "=".repeat(5));
    }

    @Override
    public void print() {
    }
}
