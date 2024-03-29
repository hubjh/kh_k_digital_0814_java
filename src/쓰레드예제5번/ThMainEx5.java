package 쓰레드예제5번;

import static java.lang.Thread.sleep;

/*
Date : 2023-09-01
Author : J.H.Hwang
Purpose :  쓰레드(Thread)를 설명하는 예제4 프로그램입니다.
 */
// 데몬 쓰레드 : 다른 쓰레드의 작업을 돕는 보조 쓰레드, 데몬 쓰레드 이외의 쓰레드가 모두 종료되면 자동 종료
public class ThMainEx5 {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveTh autoSaveTh = new AutoSaveTh();
        autoSaveTh.setDaemon(true);
        autoSaveTh.setDaemon(true); // 데몬 쓰레드를 만드는 방법
        autoSaveTh.start();
        sleep(30000);
    }
}

class AutoSaveTh extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장 함");
    }
    @Override
    public void run() {
        while (true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            save();
        }
    }
}
