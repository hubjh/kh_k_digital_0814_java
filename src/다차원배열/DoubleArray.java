package 다차원배열;
/*
Date : 2023-08-21
Author : J.H.Hwang
Purpose : 다차원 배열을 설명하는 프로그램입니다.
 */

// 2차원의 배열에서 행에 대한 배열의 값을 실제 값이 존재하는 것이 아니고 열에 대한 시작 주소를 가지고 있다.
public class DoubleArray {
    public static void main(String[] args) {
        int [][] arr = new int[2][3];   // 0번 인덱스에서 0,1,2  // 1번 인덱스에서 0,1,2
        int k = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j =0; j< arr[i].length; j++) {
                arr[i][j] = k;
                k += 10;
            }
        }
        for(int[] ints : arr) {     // i 배열 주소 [0], [1] 요소 for문
            for(int e : ints) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}