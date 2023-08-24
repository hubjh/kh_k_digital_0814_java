package 접근제한자;
/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 접근 제한자를 설명하는 프로그램입니다.
 */
public class AccessModifier {
    public static void main(String[] args) {
//        Restrictor restrictor = new Restrictor();
//        restrictor.seoul();     // Public Method 에 대한 접근,
//        restrictor.busan();     // Protected Method 에 대한 접근, 같은 패키지 이거나 상속 관계가 있으면 접근 가능
//        restrictor.deagu();     // default Method 에 대한 접근, 같은 패키지 내에서만 접근 가능
////        restrictor.inchun(); // Private Method 에 대한 접근 (같은 클래스 내부에 아니기 때문에 접근 허용이 안 됨)

        Child child = new Child("엔지니어");
        System.out.println(child.getName());
        System.out.println(child.getMoney());
        System.out.println(child.getAddr());
    }
}

class Child extends Parent {
    String jobs;
    public  Child(String jobs) {
        this.jobs = jobs;
    }
    public String getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }
    public  String getAddr() {
        return addr;
    }
}