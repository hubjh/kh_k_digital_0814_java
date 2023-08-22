package 메소드와필드;
/*
Date : 2023-08-22
Author : J.H.Hwang
Purpose : 클래스내에서 기본적인 메소드와 필드를 만들어보는 프로그램입니다.
 */

// 메소드 : 클래스 내에서 동작에 대한 기능을 구현 하는 것 (함수가 클래스 내부에 있으면 메소드로 함)
// 필드 : 클래스 내에 존재하면 값을 저장하는 변수를 의미 (상태를 저장)
public class MethodAndField {
    public static void main(String[] args) {
//        MethodAndField methodAndField = new MethodAndField();
        int result1 = sum(100, 200, 300, 400);     // 년 호출부
        int result2 = whileSum(10);
        int result3 = recFuntion(10);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
    // 메소드 앞에 static 을 선언하는 경우 객체 소속이 아니고 클래스 소속이다.
    static int sum(int a, int b) {             // 구현부
        return a + b;
    }

    // sum 메소드의 매개변수 개수를 다르게 해서 만들었으므로 오버로딩 관계가 성립
    static int sum(int a, int b, int c) {       // public을 빼면 default로 접근 제한자
        return a+b+c;
    }

    // 전개 연산자 : 매개 변수의 개수를 알 수 없을 때 사용
    static int sum(int ... val) {
        int sum = 0;
        for (int e : val) sum += e;
        return sum;
    }

    // 재귀 호출 : 메소드 자신이 자신을 호출 하는 것
    static int recFuntion(int n) {
        if(n == 1) return 1;
        return n + recFuntion(n - 1);
    }

    static int whileSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n;
            n--;
        }
        return sum;
    }
}
