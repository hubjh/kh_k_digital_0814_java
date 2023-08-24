package 상속TV;
/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 상속을 활용한 TV 만들기 프로그램입니다.
 */
public class PrototypeTV {
    boolean isPower;    // 전원값 저장
    int channel;    // 채널 정보 저장
    int volume;     // 볼륨 값 저장
    public PrototypeTV() {
        this.isPower = false;
        this.channel = 10;
        this.volume = 10;
    }
    // 생성자 오버로딩
    public PrototypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int ch) {
        if(ch > 0 && ch < 1000) {
            channel = ch;
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
//    boolean power = false;
//    void powerOnOff() {
//        if(!power) {
//            boolean power = true;
//            System.out.println("TV 전원을 킵니다.");
//        }
//        if(power) {
//            boolean power = false;
//            System.out.println("TV 전원을 끕니다.");
//        }
//    }
}

