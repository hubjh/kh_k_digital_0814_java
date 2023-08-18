package 블루마블;
/*
Date : 2023-08-18
Author : J.H.Hwang
Purpose : 두 개의 주사위를 던져 12가 나오면 탈출하는 게임 프로그램입니다.
 */
public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0;    // 몇 번 만에 탈출 했는지 확인 하기 위한 변수
        while(true) {
            cnt++;
            rand1 = (int)((Math.random() * 6) + 1);     //  Math.random() 난수 발생기 0.0 ~ 0.99999...
            rand2 = (int)((Math.random() * 6) + 1);
            if ((rand1 + rand2) == 12) {
                System.out.printf("무인도를 %d번 만에 탈출 했습니다.\n", cnt);
                break;
            } else {
                System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다.");
            }
        }

    }
}
