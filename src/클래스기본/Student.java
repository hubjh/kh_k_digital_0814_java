package 클래스기본;
/*
Date : 2023-08-22
Author : J.H.Hwang
Purpose : 기본적인 클래스를 만들어보는 프로그램입니다.
 */
public class Student {
    // private : 외부에서 해당 필드에 대한 접근 막음 , 클래스 필드 숨기기 (캡슐화)
    private int id;         // 학번, 필드라고 부름 (클래스 내에 변수라고 선언하면 인스턴스 필드라고 함)
    private String name;    // 이름
    private int grade;      // 학년
    private String addr;    // 주소

    // 메소드
    public void showInfo() {
        System.out.println(name + ", " + addr);
    }

    // Setter Method를 만듬, Setter를 통해 id를 바꿔라
    public boolean setName(String name) {
        this.name = name;
        return true;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
}
