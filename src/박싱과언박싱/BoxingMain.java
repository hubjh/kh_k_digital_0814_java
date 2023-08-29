package 박싱과언박싱;
/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose :  박싱과 언박싱을 설명하는 프로그램입니다.
 */
public class BoxingMain {
    public static void main(String[] args) {
//        Integer num = 12;   // 오토 박싱
        Integer num = new Integer(12);
//        int n = num.intValue();     // 언박싱
        System.out.println(num);

        Character ch = 'x';     // 오토 박싱
        char c = ch;    // 오토 언박싱
        System.out.println(c);
    }
}
