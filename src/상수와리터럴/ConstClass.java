package 상수와리터럴;
import java.util.Scanner;   // 스캐너를 사용하기 위해 import 해야 함

// 상수 : 변수와 마찬가지로 메모리에 저장할 공간을 확보하는 것, 단 한번만 값을 지정할 수 있음
// 값을 한번 쓰고 나면 Read only 상태가 됨
// final 키워드를 사용
public class ConstClass {
    final static String KH_DOMAIN = "http://192.167.12.13";
    final static String PORT_NUM = "8111";
    public static void main(String[] args) {
        /*
        Date : 2023-08-16
        Author : J.H.Hwang
        Purpose : 상수 설명 프로그램입니다.
         */

//        final int AGE; // 상수는 관례상 대문자 사용, 자바는 선언과 별도로 단 한번 값의 대입이 가능
//        char gender = 'M';
//
//        if(gender == 'M') {
//            AGE = 33;
//        }
//        System.out.println(age);
        final double TAX_RATE = 0.10;   // 세율 값을 고정함
//        Scanner sc = new Scanner(System.in);    // 표준 입력을 받기 위해서 사용
//        System.out.print("수입을 입력 하세요 : ");
//        int income = sc.nextInt(); // 키보드로 부터 입력 받은 값을 정수형 변수에 대입 함
//        System.out.println("당신이 내야 할 세금은 " + (income * TAX_RATE) + "입니다.");

        System.out.println(KH_DOMAIN);
        System.out.println(PORT_NUM);


    }
}
