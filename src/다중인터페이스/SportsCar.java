package 다중인터페이스;

/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose : 다중 인터페이스를 설명하기 위한 프로그램입니다.
 */
public class SportsCar extends Car implements AirCon, AutoDrive {   // 기본 기능은 Car로 부터 받고 기능 구현해줘야하는것은 interface로 받음
    private boolean isAirCon;
    private int setTemp;
    private boolean isAutoDrv;
    private int speed;
    private String color;
    private String year;
    private boolean isTurbo;

    public SportsCar(boolean isAirCon, int setTemp, boolean isAutoDrv, int speed, String color, String year, boolean isTurbo) {
        this.isAirCon = isAirCon;
        this.setTemp = setTemp;
        this.isAutoDrv = isAutoDrv;
        this.speed = speed;
        this.color = color;
        this.year = year;
        this.isTurbo = isTurbo;
    }

    public void viewInfo() {

    }

    @Override
    public void airConON() {

    }

    @Override
    public void airConOFF() {

    }

    @Override
    public void setAirConTemp(int tmp) {

    }

    @Override
    public void autoDrvON() {

    }

    @Override
    public void autoDrvOFF() {

    }
}
