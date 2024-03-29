package 쓰레드예제1번;
/*
Date : 2023-09-01
Author : J.H.Hwang
Purpose :  쓰레드(Thread)를 설명하는 예제 프로그램입니다.
 */
// 하나의 프로그램 내에서 여러가지 일을 동시에 수행 하는 것
public class ThMainEx1 {
    public static void main(String[] args) {
        // Thread 클래스를 상속 받아서 Thread 생성
        Thread testThread = new CustomThread();
        testThread.start();

        // Runnable 인터페이스를 상속 받아서 쓰레드를 만드는 방법
        Runnable runTask = new InterThread();     // 실제 작업 내용을 가지고 있지만 Thread는 아님
        Thread runThread1 = new Thread(runTask);     // Thread
        Thread runThread2 = new Thread(runTask);
        runThread1.start();
        runThread2.start();

        // 익명 객체로 쓰레드를 만드는 방법
        Runnable task = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i <= 10; i++) {
                    sum += i;
                    System.out.println("인터페이스 : " + sum);
                }
                System.out.println(Thread.currentThread() + "합 : " + sum);
            }
        };
        Thread anonyTh1 = new Thread(task);
        anonyTh1.start();

        // 람다식으로 만드는 방법
        Runnable task2 = () -> {
            int sum = 0;
            for(int i = 0; i <= 10; i++) {
                sum += i;
                System.out.println("인터페이스 : " + sum);
            }
            System.out.println(Thread.currentThread() + "합 : " + sum);
        };
        Thread anonyTh2 = new Thread(task2);
        anonyTh2.start();


        System.out.println("Main에서 찍어 봅니다.");
    }
}

// 상속 받아서 스레드를 만드는 방법 - 썩 좋은 방법은 아님 커스텀 스레드를 사용하기 위해 스레드의 상속을 포기하는건 별로이다 & 익명의 상속을 할때 사용하기도 한다.
class CustomThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("상속 받은 쓰레드 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}

class InterThread implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("인터페이스 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}