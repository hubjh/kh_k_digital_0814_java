package 비행기시뮬레이터;

import java.util.Scanner;

public class FlightSimulatorMain {
    public static void main(String[] args) throws InterruptedException {
        Flight flight = new Flight();
        Scanner sc = new Scanner(System.in);
        System.out.println("[1]엔진ON [2]속도증가 [3]속도감소 [4]이륙 [5]착륙 [6]종료");
        int control = sc.nextInt();
        if (control == 1) flight.engine_on();
        else if (control == 2) flight.speedUp();
        else if (control == 3) flight.speedDown();
        else if (control == 4) flight.takeOff();
        else if (control == 5) flight.landing();
        else if (control == 6)  

        }

//
//        flight.engine();
    }
}
