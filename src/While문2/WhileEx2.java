package While문2;

import java.util.Scanner;

/*
Date : 2023-08-18
Author : J.H.Hwang
Purpose : while문 예제2 프로그램입니다.
 */
// 반복 횟수를 알 수 없는 경우에 대한 예제
// do ~ while : 무조건 루틴을 한번 실행하고 나중에 조건을 비교해서 참이면 반복적으로 수행
public class WhileEx2 {
    public static void main(String[] args) {
        int age; // 나이를 입력 받는 변수
//        Scanner sc = new Scanner(System.in);
//        while (true) {  // 무한 루프, 반드시 탈출문이 필요
//            System.out.print("나이를 입력 하세요 : ");
//            age =sc.nextInt();
//            if (age > 0 && age < 200) break;    // 1 ~ 199 사이만 정상적으로 입력된 나이로 간주
//            System.out.println("나이를 잘 못 입력 하셨습니다.");
//        }

        // do ~ while

        do {
            System.out.print("나이를 입력 하세요. : ");
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt();

        } while (age <= 0 || age >= 200);
        System.out.println("입력 하신 나이는 " + age + "살 입니다.");
    }
}
