package This에대해서;
/*
Date : 2023-08-23
Author : J.H.Hwang
Purpose : 간단한 영화표 예매 시스템을 만드는 프로그램입니다.
 */
public class Car {      // Car car = new Car();
    private String model;   // 자동차 명
    private int year;   // 츨고 연도
    private String color;   // 색상
    private int maxSpeed;   // 최고 속도
    Car() {}
    Car(String model) {
        this(model, 2022, "black", 230);

    }
    Car(String model, int year, String color, int speed) {
        this.model = model;     // 전달되는 매개변수와 내부의 변수가 이름이 같은 경우에만 사용
        this.year = year;
        this.color = color;
        maxSpeed = speed;
    }
}
