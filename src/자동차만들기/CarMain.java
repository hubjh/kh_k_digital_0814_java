package 자동차만들기;

import java.util.Objects;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {

        int regions[] = {0, 400, 200, 150, 300};
        SportsCar tc = new SportsCar("페라리");
        PassengerCar pc = new PassengerCar("SM5");
        Bus bc = new Bus("마을 버스");

        Scanner sc = new Scanner(System.in);
        System.out.print("[1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int region = sc.nextInt();
        System.out.print("이동할 승객 수 입력 : ");
        int numOfPas= sc.nextInt();
        System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int vehicle = sc.nextInt();
        sc.nextLine();
        System.out.print("[1]ON [2]OFF : ");
        String function= sc.next();

        int oilPrice = 2000;
        int totalPrice = 0 , totalRefuel = 0;
        double travelTime = 0;

        int distance = regions[region];
        int totalDistance = 0;

        switch (vehicle) {
            case 1:
                if (Objects.equals(function, "on") || Objects.equals(function, "ON")) {
                    tc.setTurbo();
                }
                // 총 거리
                totalDistance = distance * ((numOfPas/ tc.numSeats) + 1);

                // 총 주유 횟수
                totalRefuel = totalDistance / (tc.capacity * tc.mileage) + 1;
                // 총 비용
                totalPrice = totalDistance / tc.mileage * oilPrice;

                // 총 이동 시간
                travelTime = (double) totalDistance / tc.speed;
                break;
            case 2:
                if (Objects.equals(function, "on") || Objects.equals(function, "ON")) {
                    pc.setTrunk();
                }
                // 총 거리
                totalDistance = distance * ((numOfPas/ pc.numSeats) + 1);

                // 총 주유 횟수
                totalRefuel = totalDistance / (pc.capacity * pc.mileage) + 1;
                // 총 비용
                totalPrice = totalDistance / pc.mileage * oilPrice;

                // 총 이동 시간
                travelTime = (double) totalDistance / pc.speed;
                break;
            case 3:
                if (Objects.equals(function, "on") || Objects.equals(function, "ON")) {
                    bc.setSubFuel();
                }
                // 총 거리
                totalDistance = distance * ((numOfPas/ bc.numSeats) + 1);

                // 총 주유 횟수
                totalRefuel = totalDistance / (bc.capacity * bc.mileage) + 1;
                // 총 비용
                totalPrice = totalDistance / bc.mileage * oilPrice;

                // 총 이동 시간
                travelTime = (double) totalDistance / bc.speed;
                break;
        }
        System.out.println("총 비용 : " + totalPrice);
        System.out.println("총 주유 횟수 : " + totalRefuel);
        System.out.println("총 이동 시간 : " + (int)(travelTime / 1) + "시간 " + (int)((travelTime % 1) * 60) + "분");
    }
}
