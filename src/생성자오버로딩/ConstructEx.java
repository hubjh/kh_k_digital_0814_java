package 생성자오버로딩;
/*
Date : 2023-08-22
Author : J.H.Hwang
Purpose : 생성자 오버로딩을 연습하는 프로그램입니다.
 */
public class ConstructEx {
    public static void main(String[] args) {
        Car car = new Car();
        car.carInfo();
        Car santafe = new Car("싼타페");
        santafe.carInfo();

        Car avante = new Car("아반떼", "화이트");
        avante.carInfo();

        Car gramdure = new Car("그렌저", "블랙", 220);
        gramdure.carInfo();

        Car tucson = new Car("투싼", "레드", 210, 170);
        tucson.carInfo();
    }
}
