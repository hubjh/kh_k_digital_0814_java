package 스퀘어출력;
/*
Date : 2023-08-18
Author : J.H.Hwang
Purpose : 숫자를 사각형 모양으로 출력하는 프로그램입니다.
 */
import java.util.Scanner;

// input : 3
// Output
// 1 2 3
// 4 5 6
// 7 8 9
public class SquareEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        int n = sc.nextInt();
        int num = 0;
        System.out.println("Output");
        for(int i = 1; i <= n * n; i++) {
            System.out.printf("%4d", i);
            if(i % n == 0) System.out.println();
        }


//        for (int i=0; i < n; i++) {
//            for (int j=0; j < n; j++) {
//                num+=1;
//                System.out.printf("%5d", num);
//            }
//            System.out.print("\n");
//        }
    }
}
