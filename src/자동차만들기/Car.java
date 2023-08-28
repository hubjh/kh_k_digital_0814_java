package 자동차만들기;

abstract class Car {
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
}
