package 생성자오버로딩;
/*
Date : 2023-08-22
Author : J.H.Hwang
Purpose : 생성자 오버로딩을 연습하는 프로그램입니다.
 */
public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int speed;
    int horsePower;

    Car () {}       // 생성자
    Car(String modelName) {     // 생성자 오버로딩
//        this.model = model;
        model = modelName;
    }
    Car (String model, String color) {
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    Car(String model, String color, int speed, int horsePower) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.horsePower = horsePower;
    }
    public void carInfo() {
        System.out.println(company);
        System.out.println(model);
        System.out.println(color);
        System.out.println(speed);
        System.out.println(horsePower);
    }
}
