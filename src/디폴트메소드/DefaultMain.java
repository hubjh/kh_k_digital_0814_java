package 디폴트메소드;

import java.util.Scanner;

/*
Date : 2023-08-25
Author : J.H.Hwang
Purpose :  자바 인터페이스의 디폴트 메소드를 설명하는 프로그램입니다.
 */
/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose :  익명 객체를 설명하는 프로그램입니다.
 */
public class DefaultMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품 선택 [1]TV, [2]Audio : ");
        int selectMenu = sc.nextInt();
        RemoteControl remoCon;
        if(selectMenu == 1) {
            remoCon = new Television();
            remoCon.turnON();
            remoCon.setVolume(20);
            remoCon.setMute(true);
            // 인터페이스 소속의 static 메소드
            RemoteControl.changeBattery();
        } else {
            remoCon = new Audio();
            remoCon.turnON();
            remoCon.setVolume(30);
            remoCon.setMute(true);
            }
        RemoteControl ps5 = new RemoteControl() {
            @Override
            public void turnON() {
                System.out.println("플스 5 켭니다.");

            }

            @Override
            public void turnOFF() {
                System.out.println("플스 5 끕니다.");
            }

            @Override
            public void setVolume(int vol) {

            }

            @Override
            public void setMute() {

            }
        };

        ps5.turnON();
        ps5.turnOFF();

        }
    }

