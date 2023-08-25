package 코코아톡;

import 코코아톡.NetAdapter;

/*
Date : 2023-08-25
Author : J.H.Hwang
Purpose :  자바 인터페이스를 설명하는 프로그램입니다.
 */
public class CocoaTalk {
    private String to;  // 상대방 이름
    private String msg; // 전달할 메시지
    public CocoaTalk(String name) {
        to = name;
    }
    public void writeMsg(String msg) {
        this.msg = to + " : " + msg;
    }
    public void send(NetAdapter na) {
        na.send(msg);
    }
}
