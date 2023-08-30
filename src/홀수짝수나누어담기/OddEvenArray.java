package 홀수짝수나누어담기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

/*
Date : 2023-08-30
Author : J.H.Hwang
Purpose :  7개의 정수를 입력 받아 홀, 짝을 나누어 배열에 담는 프로그램입니다.
 */
// 7개의 정수를 입력 받음
// 홀수와 짝수 배열로 나누어 담는 함수 만들기
// 홀수와 짝수를 출력 하는 함수 만들기
// 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6
public class OddEvenArray {
    public static void main(String[] args) {
//
//        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 133};
//
//        int oddCnt = 0, evenCnt = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) evenCnt++;
//            else if (arr[i] % 2 == 1) oddCnt++;
//        }
//        int[] odd = new int[oddCnt];
//        int[] even = new int[evenCnt];
//
//        int on = 0, en = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) even[en++] = arr[i];
//            else if (arr[i] % 2 == 1) odd[on++] = arr[i];
//        }
//        for (int oel : odd) System.out.printf("%4d", oel);
//        System.out.println();
//        for (int eel : even) System.out.printf("%4d", eel);


        // =========== 강사님이 하신 것 =============
//        OddEvenFunc oddEvenFunc = new OddEvenFunc();
//        oddEvenFunc.inputFunc();
//        oddEvenFunc.oddEvenCalc();
//        oddEvenFunc.oddEvenOutput();

//        OddEvenArrayList oddEvenArrayList = new OddEvenArrayList();
//        oddEvenArrayList.inputFunc();
//        oddEvenArrayList.oddEvenCalc();
//        oddEvenArrayList.oddEvenOutput();

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("정수 입력 : ");
        for(int i = 0; i < 7; i++) list.add(sc.nextInt());
        System.out.print("홀수 : ");
        list.stream()
                .filter(n->n % 2 != 0)
                .forEach(e->System.out.print(e + " "));
        System.out.println();
        System.out.print("짝수 : ");
        list.stream().filter(n->n % 2 == 0).forEach(e->System.out.print(e + " "));

    }
}
