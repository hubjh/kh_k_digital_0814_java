package 비행기시뮬레이터;

import static java.lang.Thread.sleep;

public class Flight implements FlightFrame {
    private int curr_speed = 0;
    private int accel = 0;
    boolean isPower = false;


    @Override
    public void engine_on() {
        System.out.println("엔진이 켜졌습니다.");
        isPower = true;
    }

    @Override
    public void engine_off() {
        System.out.println("엔진이 꺼졌습니다.");
        isPower = false;
    }

    @Override
    public void engine() throws InterruptedException {
        while (isPower) {
            curr_speed += accel;
            System.out.printf("이동 속도 : %d\n", curr_speed);
            Thread.sleep(500);
        }

    }

    @Override
    public void speedUp() {
        System.out.println("속도를 올립니다.");
        accel = 5;

    }

    @Override
    public void speedDown() {
        System.out.println("속도를 내립니다.");
        accel = -5;

    }

    @Override
    public void takeOff() {
//        System.out.println("비행기가 이륙합니다.");
//        }


    }

    @Override
    public void landing() {

    }
}
