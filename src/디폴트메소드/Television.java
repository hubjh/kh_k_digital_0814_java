package 디폴트메소드;
/*
Date : 2023-08-25
Author : J.H.Hwang
Purpose :  자바 인터페이스의 디폴트 메소드를 설명하는 프로그램입니다.
 */
public class Television implements RemoteControl {
    private int volume;
    @Override
    public void turnON() {
        System.out.println("TV 를 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("TV 를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }

    @Override
    public void setMute() {

    }
}
