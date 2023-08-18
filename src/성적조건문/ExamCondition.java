package 성적조건문;

import java.util.Scanner;

/*
Date : 2023-08-18
Author : J.H.Hwang
Purpose : continue 조건문 설명 프로그램입니다.
 */
public class ExamCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
