package for반복문;
/*
Date : 2023-08-18
Author : J.H.Hwang
Purpose : for문 예제 프로그램입니다.
 */
// for (초기식; 조건식; 증감식) { 참인 동안 수행되는 구문 }
// 주로 정해진 횟수를 반복하는 경우에 사용됩니다.
public class ForEx1 {
    public static void main(String[] args) {
        int i = 1;
        for(;;) {       // 이런식으로도 가능
            System.out.printf("%4d", i);
            if(i % 10 == 0) System.out.println();
            i++;
            if(i > 100) break;
        }

//        int i = 1;
//        while(true) {
//            System.out.printf("%4d", i);
//            if(i % 10 == 0) System.out.println();
//            i++;
//            if(i > 100) break;
//        }
    }
}
