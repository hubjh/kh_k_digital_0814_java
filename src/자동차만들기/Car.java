package 자동차만들기;
/*
Date : 2023-08-28
Author : J.H.Hwang
Purpose : 상속을 이용한 자바 자동차 만들기 프로그램입니다.
 */
//### 자동차
//
//        자동차는 스포츠카, 승용차, 버스를 상속 주기 위해 만들어 지며 실제 객체화 되지 않음
//
//        구현해야 할 공통의 메소드는 자동차 클래스에서 구현해서 상속주는 것으로 구현
//
//        아래는 공통으로 포함되어야 할 필드 입니다.
//
//        - 속도
//        - 연비
//        - 연료탱크 크기
//        - 좌석수
//        - 차량이름
abstract class Car implements CarFrame {

    int oilPrice = 2000;
    // 속도
    int speed = 0;
    // 연비
    int mileage = 0;
    // 연료탱크 크기
    int capacity = 0;
    // 좌석 수
    int numSeats = 0;
    // 차량이름
    String carName = "";
    public void state() {
        System.out.println("=".repeat(5) + carName +"차의 상태" + "=".repeat(5));
        System.out.println("속도 : " + speed + "km");
        System.out.println("연비 : " + mileage + "km");
        System.out.println("연료탱크 크기 : " + capacity + "L");
        System.out.println("좌석 수 : " + numSeats + "개");
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
