package 아이패드만들기;
/*
Date : 2023-08-23
Author : J.H.Hwang
Purpose : 아이패드 만들기 프로그램입니다.
 */
public class IPadMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            IPadPro iPadPro = new IPadPro("iPad Pro");
            if (!iPadPro.continueOrder()) break;
            iPadPro.setScreen();
            iPadPro.setColor();
            iPadPro.setMemory();
            iPadPro.setNetwork();
            iPadPro.setName();
            iPadPro.setSerialNum();
            iPadPro.progressPad();
            iPadPro.productPad();
        }
    }
}
