package 파일스트림읽기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Date : 2023-09-05
Author : J.H.Hwang
Purpose :  파일 읽기를 설명하는 프로그램입니다.
 */
public class FileStreamRead {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {   // 리소스를 많이 먹으니 최소 구간만 코딩
            inputStream = new FileInputStream("src/파일스트림읽기/아무말.txt");
        } catch (FileNotFoundException e) {
            System.out.println("읽을 파일을 찾지 못했습니다.");
        }
        assert inputStream != null;
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNext()) {  // 읽을 내용이 있으면 참이 됨
            String line = sc.nextLine();    // 문자열을 '\n' 을 기준으로 읽음
            System.out.println(line);
        }
    }
}
