package 디폴트메소드중복;
/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose : 인터페이스의 디폴트 메소드를 설명하기 위한 프로그램입니다.
 */
public class DefaultDuplicate {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
    }
}
