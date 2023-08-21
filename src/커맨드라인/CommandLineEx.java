package 커맨드라인;
/*
Date : 2023-08-21
Author : J.H.Hwang
Purpose : 자바의 프로그램의 커맨드라인 매개변수를 설명하기 위한 프로그램입니다.
 */
// main은 메소드는 자바 프로그램의 시작 지점 입니다.
// CLI (Command Line Interface) : 입력
public class CommandLineEx {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("프로그램 사용법");
            System.out.println("Java Main String Argument num1 num2");
            System.exit(0); // 프로그램 강제 종료
        }
        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);

    }
}
