package exercise_230817;
/*
Date : 2023-08-17
Author : J.H.Hwang
Purpose : 연습문제1 프로그램입니다.
 */

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        // 입력을 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 입력을 받아서 정수형 변수에 대입

        // 조건문을 만드는데 우선, 0 ~ 100 사이의 정상적인 입력인지 확인
        while (true) {
            System.out.println("성적을 입력 하세요 : ");
            int score = sc.nextInt();
            if (score < 0 || score > 100) continue;
            // 정상적인 입력이었다면 각각의 성적 구간에 따라 한점 출력
            if (score >= 90) System.out.println("A");    // 한줄 코드일때는 블록{} 생략 가능 !!
            else if (score >= 80) System.out.println("B");
            else if (score >= 80) System.out.println("C");
            else if (score >= 80) System.out.println("D");
            else System.out.println("F");
            break;
        }
    }

}
//        // 조건문을 만드는데 우선, 0 ~ 100 사이의 정상적인 입력인지 확인
//        if(score >= 0 && score <= 100) {
//            // 정상적인 입력이었다면 각각의 성적 구간에 따라 한점 출력
//            if(score >= 90) System.out.println("A");    // 한줄 코드일때는 블록{} 생략 가능 !!
//            else if(score >= 80) System.out.println("B");
//            else if(score >= 80) System.out.println("C");
//            else if(score >= 80) System.out.println("D");
//            else System.out.println("F");
//        } else {
//            System.out.println("성적을 잘 못 입력하셨습니다.");
//        }



//        int score;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("시험 성적을 입력해주세요. : ");
//        score = sc.nextInt();
//        if (score <= 100 && score >= 0) {
//            if (score >= 90) {
//                System.out.print("시험 성적은 A입니다.");
//            } else if (score >= 80) {
//                System.out.print("시험 성적은 B입니다.");
//            } else if (score >= 70) {
//                System.out.print("시험 성적은 C입니다.");
//            } else if (score >= 60) {
//                System.out.print("시험 성적은 D입니다.");
//            } else {
//                System.out.print("시험 성적은 F입니다.");
//            }
//        } else {
//            System.out.print("성적이 잘못 입력되었습니다.");
//        }

