package 쓰레드예제4번;

import static java.lang.Thread.sleep;

/*
Date : 2023-09-01
Author : J.H.Hwang
Purpose :  쓰레드(Thread)를 설명하는 예제4 프로그램입니다.
 */
// thread를 안전하게 종료 하기, stop() 메소드는 사용 중지 됨
public class ThMainEx4 {
    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();
        runThread.start();
//        sleep(2000);
//        runThread.setStop(true);        // false -> true 로 바꿔 줌

        try {
            sleep(3000);
        } catch (InterruptedException e) {}
        runThread.interrupt();
    }
}

//class RunThread extends Thread {
//    private boolean stop = false;   // stop 플래스 설정
//
//    public void setStop(boolean stop) {
//        this.stop = stop;
//    }
//    @Override
//    public void run() {
//        while(!stop) {
//            System.out.println("Thread 실행 중......");
//        }
//        System.out.println("자원 정리...");
//        System.out.println("실행 종료...");
//    }
//}

class RunThread extends Thread {
    @Override
    public void run() {
        try {
            while(true) {
                System.out.println("Thread 실행 중......");
                sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("인터럽트 발생 !!!!!!!");
        }
        System.out.println("자원 정리...");
        System.out.println("실행 종료...");
    }
}