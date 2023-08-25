package 추상클래스두번째;
/*
Date : 2023-08-25
Author : J.H.Hwang
Purpose : 추상 클래스를 설명하는 프로그램입니다.
 */

// Phone은 인스턴스화 될 수 없음
public abstract class Phone {
    public String name;
    public boolean isPower;
    public Phone(String name){
        this.name = name;
    }
    public void setPower(boolean isPower) {
        this.isPower = isPower;
        if(isPower) System.out.println("Phone Power ON");
        else System.out.println("Phone Power OFF");
    }
    abstract void call();   // 추상 메소드 : 선언부만 있고 구현부가 없다는 의미로 선언부 끝에 바로 세미콜론(;)을 추가
}
