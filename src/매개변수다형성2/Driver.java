package 매개변수다형성2;
/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 매개변수 다형성을 설명하는 두번째 프로그램입니다.
 */
public class Driver {
    String name;
    public  Driver(String name) {
        this.name = name;
    }
    public void drive(Vehicle vehicle) {
        System.out.println(name + "의 ");
        vehicle.run();

    }
}
