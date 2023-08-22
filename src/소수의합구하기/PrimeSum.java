package 소수의합구하기;

import java.util.Scanner;

/*
Date : 2023-08-22
Author : J.H.Hwang
Purpose : 코딩테스트 프로그램입니다.
 */
// 입력 받은 정수보다 미만의 소수의 합을 구하는 함수를 만드세요.
// 예) 12면 2+3+5+7+11 = 28
// 소수란? 1과 자기 자신 이외의 자연수로 나누어지지 않는 수
public class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        int num = sc.nextInt();
        int sum = 0;

        PrimeSumMethod primeSumMethod = new PrimeSumMethod();

        // 입력 받은 정수 미만의 소수를 찾기 위해 반복적으로 isPrime()메소드 호출
        for (int i = 2; i <= num; i++) {        // 2에서 입력받은 정수 미만 중 소수만 누적
            if (primeSumMethod.isPrime(i) == 1) {
                sum += i;
            }
        }
        System.out.print(sum);

    }

}

