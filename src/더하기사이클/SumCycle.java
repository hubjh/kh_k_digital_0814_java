package 더하기사이클;
/*
Date : 2023-08-22
Author : J.H.Hwang
Purpose : 더하기 싸이클 코딩테스트 프로그램입니다.
 */
// 입력 받은 수를 더하기 싸이클 조건을 수행했을 때 몇 회 만에 원래 입력한 수와 같아 지는지 확인하는 문제
// 입력 26 => 2와 6으로 분리해서 더함 => 8
// 원래 값의 1의 자리와 새롭게 만들어진 수의 1의 자리를 다시 더함 => 68
// 1 cycle -----------------------------------------------------------------------
// 68 => 6과 8을 다시 분리해서 더함 => 14
// 원래 값의 1의 자리와 새롭게 만들어진 수의 1의 자리를 다시 더함 => 12
// 2 cycle -----------------------------------------------------------------------

import java.util.Scanner;

public class SumCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int input = sc.nextInt();   // 최초 숫자를 입력 받음
        int totalCnt = 0;   // 총 사이클 누적 횟수
        int calcNum = input;    // 최초 입력값이 변경되지 않도록 하기 위해서...
        int divSum = 0; // 수를 10의 자리와 1의 자리로 분리해서 더하기 위한 변수
        int newNum = 0;
        while(true) {
            totalCnt++;
            divSum = (calcNum / 10) + (calcNum % 10);  // 10의 자리와 1의 자리를 분리해서 더함
            newNum = (calcNum % 10) * 10 + (divSum % 10);  // 앞의 1의 자리의 + 계산된 값의 1자리를 더함
            if(newNum == input) break;
            calcNum = newNum;
        }
        System.out.println(totalCnt);
    }
}
