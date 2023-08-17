package 비트연산자;
/*
Date : 2023-08-17
Author : J.H.Hwang
Purpose : 비트 연산자 설명 프로그램입니다.
 */
// 비트 연산자는 비트 단위의 연산을 수행 합니다.
// AND : & 비교하는 두 개의 비트가 모두 1이어야 1이 됨
// OR : | 비교하는 두 개의 비트가 한 쪽만 1이면 1이 됨
// XOR : ^ 비교하는 두 개의 비트가 서로 다른 경우만 1
// NOT : ~ 현재의 비트의 값을 반전 시킴
// 왼쪽 쉬프트 : << 비트를 왼쪽으로 이동 시킴
// 오른쪽 쉬프트 : >> 비트를 오른쪽으로 이동 시킴
public class BitOperate {
    public static void main(String[] args) {
        int num1 = 10, num2 = 12;
        System.out.println(num1 & num2);
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);      // 보수효과
        System.out.println(~num2);  
        System.out.println(num1 << 1);  // x 2 효과   성능이 빠르다
        System.out.println(num1 >> 1);  // / 2 효과   성능이 빠르다
    }
    // good
}
