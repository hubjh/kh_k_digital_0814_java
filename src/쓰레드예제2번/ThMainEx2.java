package 쓰레드예제2번;

import java.awt.*;

import static java.lang.Thread.sleep;

/*
Date : 2023-09-01
Author : J.H.Hwang
Purpose :  쓰레드(Thread)를 설명하는 예제2 프로그램입니다.
 */
public class ThMainEx2 {
    public static void main(String[] args) {

        // ===================== sleep() =========================

//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        for(int i = 0; i < 10; i++) {
//            toolkit.beep();
//            try {
//                sleep(3000);
//            } catch (InterruptedException e) {
//            }
//        }

        // ===================== Join() =========================
        SumThread sumThread = new SumThread();
        sumThread.start();
        System.out.println("main이 일을 하는지 확인???");
//        sleep(1);
        try {
            sumThread.join(2);       // sumThread가 작업을 완료할때 까지 기다림
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("합 : " + sumThread.getSum());
    }
}

class SumThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run() {
        for(int i = 0; i <= 1000000000; i++) {
            sum += 1;
        }
    }
}