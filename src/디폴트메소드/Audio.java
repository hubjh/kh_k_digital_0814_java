package 디폴트메소드;
/*
Date : 2023-08-25
Author : J.H.Hwang
Purpose :  자바 인터페이스의 디폴트 메소드를 설명하는 프로그램입니다.
 */
public class Audio implements RemoteControl {
    private int volume;
    @Override
    public void turnON() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio를 끕니다.");

    }

    @Override
    public void setVolume(int vol) {
        if(vol > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(vol < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = vol;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }

    @Override
    public void setMute() {

    }

    void getInfo() {
        System.out.println("오디오 입니다.");
        System.out.println("현재 Audio 볼륨은 " + volume + " 입니다.");
    }

    @Override
    public void setMute(boolean mute) {
        if(mute) System.out.println("오디오를 무음 처리 합니다.");
        else System.out.println("오디오를 무음 처리를 해제 합니다.");
    }
}
