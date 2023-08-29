package 클론오브젝트;
/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose :  클론 메소드를 설명하는 프로그램입니다.
 */
// clone()은 Cloneable 인터페이스를 상속 받은 경우에만 가능
public class Member implements Cloneable {
    String id;
    String name;
    String password;
    int age;
    boolean adult;
    void viewInfo() {
        System.out.println("ID " + id);
        System.out.println("이름 " + name);
        System.out.println("비밀번호 " + password);
        System.out.println("나이 " + age);
        System.out.println("성인 " + adult);
    }

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }

    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();  // clone() 는 Object 클래스 타입이므로 형변환
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
//            System.out.println(e);
        }
        return cloned;
    }
}
