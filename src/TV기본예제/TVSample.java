package TV기본예제;
/*
Date : 2023-08-22
Author : J.H.Hwang
Purpose : 생성자 오버로딩을 연습하는 프로그램입니다.
 */
public class TVSample {
    public static void main(String[] args) {
        TV tv = new TV();
//        tv.getInfoTV();

        TV gTV = new TV(false, 20, 20);
//        gTV.getInfoTV();
        gTV.setON(true);
        gTV.setChannel(59);
        gTV.setVolume(20);
        gTV.getInfoTV();
    }
}
