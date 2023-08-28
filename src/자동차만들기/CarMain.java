package 자동차만들기;
/*
Date : 2023-08-28
Author : J.H.Hwang
Purpose : 상속을 이용한 자바 자동차 만들기 프로그램입니다.
 */

import java.util.Objects;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        int regions[] = {0, 400, 200, 150, 300};
        Scanner sc = new Scanner(System.in);
        System.out.print("[1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int region = sc.nextInt();
        System.out.print("이동할 승객 수 입력 : ");
        int numOfPas = sc.nextInt();
        System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int vehicle = sc.nextInt();
        sc.nextLine();
        System.out.print("[1]ON [2]OFF : ");
        String function = sc.next();
        int distance = regions[region];
        switch (vehicle) {
            case 1:
                SportsCar tc = new SportsCar("Ferrari");
                if (Objects.equals(function, "on") || Objects.equals(function, "ON")) tc.setTurbo();
                tc.state();
                tc.print(distance, numOfPas);
                break;
            case 2:
                PassengerCar pc = new PassengerCar("GV80");
                if (Objects.equals(function, "on") || Objects.equals(function, "ON")) pc.setTrunk();
                pc.state();
                pc.print(distance, numOfPas);
                break;
            case 3:
                Bus bc = new Bus("관광버스");
                if (Objects.equals(function, "on") || Objects.equals(function, "ON")) bc.setSubFuel();
                bc.state();
                bc.print(distance, numOfPas);
                break;
        }
    }
}