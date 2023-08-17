package 변수의스코프;

// 변수가 할당되고 사용되는 범위 확인


public class VarScopeClass {
    public static void main(String[] args) {
        /*
        Date : 2023-08-14
        Author : J.H.Hwang
        Purpose : 변수 스코프 설명 프로그램입니다.
         */
////        int value = 10;     // int 형으로 선언된 value 변수에 10을 대입
////        int sum = value + 20;   // int 형으로 선언된 sum 변수에 value의 값 + 20;
////        System.out.println("SUM의 값 : " + sum);
//
//        int n = 20;
//        int m = 30;
//        if (n > 10) {   // 블록 스코프
////            int m = 30;
//            m = n - 10;
//            System.out.println("m = " + m);
//        }
//        int k = n + m;
//
//        byte num1 = 127;    // -128 ~ 127
//        num1++;
//        System.out.println(num1);


        /*
        Date : 2023-08-16
        Author : J.H.Hwang
        Purpose : 자료형 설명 프로그램입니다.
         */

        // 문자 자료형 : 자바에서는 유니코드를 사용 (2바이트로 전세계의 모든 문자를 표시), 앞의 1바이트는 ASCII와 동일
//        String ch1 = "A"; // ""은 문자 열로 간주
        char ch = 'A'; // 자바에서 문자는 작은 따옴표('')를 사용, 실제 저장은 정수 값으로 저장 됨
//        System.out.println(ch);
//        System.out.println((int)ch);    // 명시적인 형을 int형으로 변경 함

        char ch2 = 66;  // char형은 음수가 올 수 없음
//        System.out.println(ch);
//        System.out.println((int)ch2);


        // 실수 자료형 : float(4Byte, 32bit), double(8Byte, 64bit), 근사치 계산법
//        float height = 175.5f;
//        double pi = 3.14159;
        double num1 = 0.1;
        for(int i = 0; i < 1000; i++) {
            num1 += 0.1;
        }
        System.out.println(num1);
    }
}
