package 상속TV;
/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 상속을 활용한 TV 만들기 프로그램입니다.
*/
// PrototypeTV 로 부터 상속을 받아 ProductTV 클래스를 만듬
public class ProductTV extends PrototypeTV {
    String name;
    boolean isInternet;
    ProductTV() {
        name = "Smart TV";
    }
    ProductTV(String name) {
        isPower = false;
        channel = 10;
        volume = 10;
        isInternet = false;
        this.name = name;
    }
    void setPower(boolean isPower) {
        this.isPower = isPower;
    }
    void setVolume(int vol) {
        if(vol >= 0 && vol <= 100) {
            this.volume = vol;
        } else System.out.println("볼륨 설정 범위를 벗어났습니다.");
    }
    // 오버라이딩 : 부모에게서 물려 받은 기능을 재정의 해서 사용하는 것
    @Override   // @ <= 어노테이션 : 상속이 문법적으로 맞는지 검증해주는 기능
    public void setChannel(int ch) {
        if(ch > 1 && ch < 2000) {
            channel = ch;
            System.out.println("채널을 " + channel + "변경 했습니다.");
        } else System.out.println("채널 설정 범위를 벗어 났습니다.");
    }

    // 메소드 오버로딩 : 동일 이름의 메소드를 매개변수의 타입이나 개수로 구분하는 것
    public void setChannel(int ch, boolean isInternet) {
        if(isInternet) {
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = true;
        } else {
            this.isInternet = false;
            if(ch > 1 && ch < 2000) {
                channel = ch;
                System.out.println("채널을 " + channel + "변경 했습니다.");
            } else System.out.println("채널 설정 범위를 벗어 났습니다.");
        }
    }
    void viewTV() {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷모드 : " + isInternet);
    }
}
