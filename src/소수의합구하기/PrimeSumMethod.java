package 소수의합구하기;
/*
Date : 2023-08-22
Author : J.H.Hwang
Purpose : 코딩테스트 프로그램입니다.
 */

// 1,2,3,5,7,11,13,17,19,23,29,31

// 1 2 3 4 5 6 7 8 9 10
public class PrimeSumMethod {
    static int isPrime(int n) {
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
