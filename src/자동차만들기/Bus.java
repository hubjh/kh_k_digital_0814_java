package 자동차만들기;
/*
Date : 2023-08-28
Author : J.H.Hwang
Purpose : 상속을 이용한 자바 자동차 만들기 프로그램입니다.
 */
//### 버스
//
//        - 연비 : 5km
//        - 속도 : 150km
//        - 연료탱크 크기 : 100리터
//        - 좌석수 : 20
//        - 차량이름은 입력 생성자 받아서 설정
//        - 부가기능 : 보조연료탱크(켜면 연료탱크 크기가 30리터 늘어남)
public class Bus extends Car{
    String carName;
    boolean subFuel = false;
    Bus(String carName) {
        this.mileage = 5;
        this.speed = 150;
        this.capacity = 100;
        this.numSeats = 20;
        this.carName = carName;
    }
    public void setSubFuel() {
        if(!subFuel) {
            capacity = (int)(capacity + 30);
            System.out.println(carName + "의 보조연료탱크기능을 켭니다.");
            subFuel = true;
        }
    }

    @Override
    public void print() {}
}
