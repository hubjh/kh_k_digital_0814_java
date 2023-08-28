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
        if(!turbo) {
            speed = (int)(speed * 1.2);
            System.out.println(carName + "의 터보기능을 켭니다.");
            turbo = true;
        }
    }
    public void print(int distance, int numOfPas) {
        int totalDistance, totalRefuel, totalPrice;
        double travelTime;
        // 총 거리
        totalDistance = distance * ((numOfPas/ numSeats) + 1);

        // 총 주유 횟수
        totalRefuel = totalDistance / (capacity * mileage) + 1;
        // 총 비용
        totalPrice = totalDistance / mileage * oilPrice;
        // 총 이동 시간
        travelTime = (double) totalDistance / speed;
        System.out.println("총 비용 : " + totalPrice);
        System.out.println("총 주유 횟수 : " + totalRefuel);
        System.out.println("총 이동 시간 : " + (int)(travelTime / 1) + "시간 " + (int)((travelTime % 1) * 60) + "분");
    }

}
