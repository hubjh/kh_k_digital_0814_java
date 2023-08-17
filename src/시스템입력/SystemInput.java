package 시스템입력;

/*
Date : 2023-08-16
Author : J.H.Hwang
Purpose : 시스템 입력 설명 프로그램입니다.
 */
// Scanner 클래스를 사용해서 입력 받음
import java.util.Scanner;

public class SystemInput {
    public static void main(String[] args) {
        // 클래스는 설계도면이라고 생각하면 됨
//        Scanner sc = new Scanner(System.in);    // 스캐너에 대한 객체 생성
//        byte a = sc.nextByte(); // Byte 입력을 받아 반환
//        short b = sc.nextShort();   // short 형의 입력을 받아 반환
//        int c = sc.nextInt();   // int 형의 입력을 받아 반환
//        long d = sc.nextLong(); // long 형의 입력을 받아 반환
//        char ch = sc.next().charAt(0);  // 문자열에서 0번째(첫번째) 문자를 추출
//        float e = sc.nextFloat();   // float 형의 입력을 받아 반환
//        double f = sc.nextDouble(); // double 형의 입력을 받아 반환
//        String n = sc.next();   // 공백 기준으로 입력 받음
//        String i = sc.nextLine();   // 줄비꿈 문자 기준

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next();    // 이름을 입력 받은 후 공백이나 \n를 입력받으면 다음으로 넘어 감
        sc.nextLine();      // 버퍼 비우기 ** 중요
        System.out.print("주소를 입력 하세요 : ");
        String addr = sc.nextLine();    // \n를 입력받으면 다음으로 넘어 감
        System.out.print("성별을 입력 하세요 : ");
        char gender = sc.next().charAt(0);  // 입력 받은 문자열에서 맨 앞의 문자 1자 추출
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("===== 회원 정보 출력 =====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);

    }
}
