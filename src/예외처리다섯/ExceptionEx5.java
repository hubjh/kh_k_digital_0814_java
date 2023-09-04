package 예외처리다섯;

import java.io.IOException;

/*
Date : 2023-09-04
Author : J.H.Hwang
Purpose :  예외처리를 설명하는 프로그램입니다.
 */
// 예외 처리 미루기
public class ExceptionEx5 {
    public static void main(String[] args) {
        IOSample test = new IOSample();
        try {
            test.input();
        } catch (IOException e){
            System.out.println("입력 에러 발생 .....");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}

class IOSample {
    private int num;
    public void input() throws IOException {
        num = System.in.read();
    }
    public void output() throws IOException {
        System.out.println(num);
    }
}
