package 파일복사하기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Date : 2023-09-05
Author : J.H.Hwang
Purpose :  파일 복사를 설명하는 프로그램입니다.
 */
public class FileCopyEx {
    public static void main(String[] args) throws IOException {
        String originFileName = "src/파일복사하기/bearimage.jpeg";
        String targetFileName = "src/파일복사하기/bear.jpeg";

        FileInputStream fis = new FileInputStream(originFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;
        byte[] readBytes = new byte[100];
        while ((readByteNo = fis.read(readBytes)) != -1) {
            fos.write(readBytes, 0, readByteNo);
        }
        fos.flush();
        fos.close();
        fis.close();

    }
}
