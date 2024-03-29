package 형변환;

/*
Date : 2023-08-16
Author : J.H.Hwang
Purpose : 형변환 설명 프로그램입니다.
 */

// 형 변환이란 : 하나의 데이터 타입을 다른 타입으로 변환 하는 것
// 명시적 형변환 : 개발자가 의도를 가지고 형변환을 하는 것
// 묵시적 형변환 : 컴파일러가 자동으로 해주는 것 (유리한 방향으로 변경)
public class TypeCasting {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
//        double result1 = num1 / num2;   // 형변환이 안일어남
//        double result2 = (double)num1 / num2;   // 명시적, 묵시적 형변환이 일어남
//        System.out.println(result2);


//        int kor = 90;
        String kor = "90";
//        int intKor = Integer.parseInt(kor); // 문자열을 숫자로 변환하는 메소드
        int mat = 88;
        int eng = 55;
        int total = Integer.parseInt(kor) + mat + eng;    // 총점
        double avg = (double)total / 3;

        System.out.println(avg);

        // 형변환 주석이 반영되는지 확인
    }
}
