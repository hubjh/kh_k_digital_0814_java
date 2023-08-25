package 인터페이스기본;

import java.util.Scanner;

/*
Date : 2023-08-25
Author : J.H.Hwang
Purpose : 자바 인터페이스를 설명하는 프로그램입니다.
 */
public class InterfaceBasic {
    public static void main(String[] args) {
        NetworkAdapter adapter; // 완전 추상화가 적용된 인터페이스
        Scanner sc = new Scanner(System.in);
        System.out.println("연결할 네트워크 [1]LAN [2]WiFi [3]5G : ");
        int sel = sc.nextInt();
        switch (sel) {
            case 1:
                adapter = new LAN("KT Megapass");
                adapter.connect();
                break;
            case 2:
                adapter = new WiFi("SK Telecom");
                adapter.connect();
                break;
            case 3:
                adapter = new WiFi("LG U+");
                adapter.connect();
                break;
        }
    }
}
