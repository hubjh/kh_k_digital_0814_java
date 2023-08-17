package 변수와자료형;
// 변수란 ? 값을 저장할 수 있는 메모리 공간에 이름을 붙이는 것
public class DataTypeClass {
    public static void main(String[] args) {
        /*
        Date : 2023-08-14
        Author : J.H.Hwang
        Purpose : 변수 타입 설명 프로그램입니다.
         */
        int age;    // 정수형 변수 선언, 4바이트(32bit) 공간을 확보하고 초기 값은 아직 없음, 정수 값(소수점 이하가 없는 값)을 저장하는 목적,
        double value;   // 실수 값을 저장하기 위한 변수 선언

//        /*
//        int 1st;    // 숫자가 앞에 오면 안됨
//        int st1;    // 이건 가능
//        int class;   // class는 예약어
//         */
//
//        int a$$$$$$$;  // 특수 문자는 _,$ 만 가능
//        int _____________1234;
//        int $$$$_______;
//        int taxRate;    // 자바는 카멜 표기법을 사용 합니다.

        char gender = 'M';  // 선언과 동시에 초기화, gender라는 변수에 문자 M을 대입 한다는 의미, 2bit 자바는 유니코드(전 세계 문자를 표현하기 위해) , C C++은 아스키코드 1bit, 음수가 없다

        // 논리형 변수 선언 : 참과 거짓을 판별하기 위해서 사용하는 자료형, 자바는 true, false 예약어만 사용 할 수 있다.
        boolean isTrue = true;
        boolean isFalse = false;

        // 정수형 변수 선언 : 소수점 이하가 없고 양수와 음수가 존재
        byte bNum;  // 1 Byte 크기의 변수 선언 1Byte == 8bit (-128 ~ +127)
        short sNum; // 2 Byte 크기의 변수 선언
        int iNum;   // 4 Byte  , 컴파일러는 정수형 값에 맞춰서 돌아간다 제일 빠름 (default)
        long lNum;  // 8 Byte

        // 실수형 변수 선언
        float fNum;     // 4 Byte
        double dNum;    // 8 Byte   (default)

        int num1, num2; // 같은 타입의 변수를 동시에 선언할 수 있음
        double num3 = 3.14; // 선언과 동시에 값을 초기화 함
        double num4 = 1.23, num5 = 4.56;
        int hour = 4;
        int minute = 50;
        System.out.println(hour + "시간" + minute + "분");
    }

//    class NameCard {
//        String name;
//        String address;
//        String eMail;
//        String phoneNum;
//    }
}
