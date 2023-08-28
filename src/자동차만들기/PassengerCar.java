package 자동차만들기;
/*
Date : 2023-08-28
Author : J.H.Hwang
Purpose : 상속을 이용한 자바 자동차 만들기 프로그램입니다.
 */
//### 승용차
//
//        - 연비 : 12km
//        - 속도 : 200 km
//        - 연료 탱크 크기 : 45 리터
//        - 좌석수 : 4
//        - 차량이름은 생성자 입력 받아서 설정
//        - 부가기능 : 트렁크가 좌석으로 변경 (켜면 승객 1명 추가)
public class PassengerCar extends Car {
    String carName;
    boolean trunk = false;
    PassengerCar(String carName) {
        this.mileage = 12;
        this.speed = 200;
        this.capacity = 45;
        this.numSeats = 4;
        this.carName = carName;
    }
    public void setTrunk() {
        if(!trunk) {
            numSeats = (int)(numSeats + 1);
            System.out.println(carName + "의 트렁크가 좌석으로 변경됩니다.");
            trunk = true;
        }
    }

    @Override
    public void print() {}
}
