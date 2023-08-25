package 코코아톡;

import 코코아톡.NetAdapter;

import java.util.Scanner;

/*
Date : 2023-08-25
Author : J.H.Hwang
Purpose :  자바 인터페이스를 설명하는 프로그램입니다.
 */
public class CocoaMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk("곰돌이사육사");
        cocoaTalk.writeMsg("오늘 아침에 비가 많이 왔어요^^");
        NetAdapter adapter;
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 [1]WiFi [2]5G : ");
        int sel = sc.nextInt();
        if(sel == 1) adapter = new WiFi();
        else adapter = new FiveG();
        cocoaTalk.send(adapter);

    }
}
