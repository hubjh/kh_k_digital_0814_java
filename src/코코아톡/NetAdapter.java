package 코코아톡;

import 코코아톡.NetAdapter;

/*
Date : 2023-08-25
Author : J.H.Hwang
Purpose : 자바 인터페이스를 설명하는 프로그램입니다.
 */
public interface NetAdapter {
    void connect();
    void send(String msg);
}

class WiFi implements NetAdapter {
    @Override
    public void connect() {
        System.out.println("WiFi에 연결 되었습니다.");
    }
    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}
class FiveG implements NetAdapter {
    @Override
    public void connect() {
        System.out.println("FiveG에 연결 되었습니다.");
    }
    @Override
    public void send(String msg) {
        System.out.println("FiveG >> " + msg);
    }
}