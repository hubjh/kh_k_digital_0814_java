package 정적멤버와메소드;
/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 정적 멤버와 메소드를 설명하는 프로그램입니다.
 */

public class Bank {
    private static int count = 0;   // 정적 필드, 객체로 생성되지 않음
    private int account;    // 계좌
    private String bank;    // 은행 이름
    Bank(String name, int account) {
        count++;
        this.bank = name;
        this.account = account;
        System.out.println(this.bank + "은행에 계좌를 개설 합니다. 잔액은 " + this.account + "입니다.");
    }
    public static int getCount() {  // 정적 메소드, 객체로 만들어지지 않음 (메소드 영역에 올라감)
        return count;
    }
    public void setDeposit(final int dep) {     // 입금, 예금하는 금액이 오면 '절대' 바뀌면 안된다.
        this.account += dep;
        System.out.println(dep + "을 예금 했습니다.");
    }

    public void setWithDraw(final int with) {
        if(with > account) {
            System.out.println("잔액이 부족 합니다.");
        } else {
            account -= with;
        }
    }
    public void viewAccount() {
        System.out.println("현재 잔액은 : " + account + "입니다.");
    }
}
