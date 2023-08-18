package 회원정보;
/*
Date : 2023-08-18
Author : J.H.Hwang
Purpose : 패키지 설명 메인 프로그램입니다.
 */
public class MemberClass {
    public static void main(String[] args) {
        MemberInfo memberInfo = new MemberInfo();   // <type> <참조변수(주소)> = <인스턴스>
        memberInfo.setName();
        memberInfo.setAge();
        memberInfo.setGender();
        memberInfo.setJobs();
        memberInfo.getInfo();
    }
}
