package 디폴트메소드;
/*
Date : 2023-08-25
Author : J.H.Hwang
Purpose :  자바 인터페이스의 디폴트 메소드를 설명하는 프로그램입니다.
 */
public interface RemoteControl {
    int MAX_VOLUME = 100;   // final static 추가 됨
    int MIN_VOLUME = 0;
    void turnON();    // 자동으로 public abstract 추가 됨
    void turnOFF();
    void setVolume(int vol);
    void setMute();
    // 디폴트 메소드는 JDK 8 이후에 추가 됨
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }
    static void changeBattery() {
        System.out.println("건전지 교환 합니다.");
    }
}
