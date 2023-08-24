package 나머지중복측정;

/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 42로 나눈 나머지의 중복 갯수를 찾아내는 코딩 테스트 프로그램입니다.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Remain {
    public static void main(String[] args) {
// ================ 내가 푼 것 =================
//        int remain;
//        int div = 42;
//        int[] inArr = {39,40,41,42,43,44,82,83,84,85};
//        HashSet hashset = new HashSet(Arrays.asList(inArr));
//        Set h = new HashSet();
//        for (int e : inArr) {
//            remain = e % div;
//            h.add(remain);
//        }
//        System.out.println(h.size());


        // ================== 강사님이 푼 것 ====================
        int[] arr = new int[42];
        int cnt = 0;    // 42로 나눈 나머지가 다른 경우에 대한 총 숫자
        int input;  // 입력 받은 값
        Scanner sc = new Scanner(System.in);
        System.out.print("10개의 수 입력 : ");
        for(int i = 0; i < 10; i++) {
            input = sc.nextInt();
            arr[input % 42] = 1;    // 입력 받은 값을 42로 나눈 나머지에 해당하는 인덱스에 1을 대입
        }
        for(int e : arr) cnt += e;
        System.out.println(cnt);
    }
}