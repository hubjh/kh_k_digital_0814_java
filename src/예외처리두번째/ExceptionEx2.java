package 예외처리두번째;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
Date : 2023-09-04
Author : J.H.Hwang
Purpose :  예외처리를 설명하는 프로그램입니다.
 */
public class ExceptionEx2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            br.readLine();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("파일이 없습니다. 다시 첨부해 주세요.");
        }
    }
}
