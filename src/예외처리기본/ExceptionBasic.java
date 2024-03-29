package 예외처리기본;
/*
Date : 2023-09-04
Author : J.H.Hwang
Purpose :  예외처리를 설명하는 프로그램입니다.
 */
public class ExceptionBasic {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("배열의 인덱스를 초과 했습니다. 값을 확인해 주세요!!!!");
        }
        System.out.println("프로그램 종료.");
    }
}
