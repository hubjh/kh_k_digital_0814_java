package 매개변수다형성2;
/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 매개변수 다형성을 설명하는 두번째 프로그램입니다.
 */
public class Vehicle {
    public void run() {
        System.out.println("차량이 달립니다.");
    }
}

class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }
}

class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}

class SportsCar extends Vehicle {
    @Override
    public void run() {
        System.out.println("스포츠카가 달립니다.");
    }
}

