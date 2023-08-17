package exercise_230817;

import java.util.Scanner;

/*
Date : 2023-08-17
Author : J.H.Hwang
Purpose : 연습문제3 프로그램입니다.
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 제목 날짜(20230817) 시간(17) 정보를 입력해주세요. : ");
        String str = sc.nextLine();
        String[] stChange = str.split("\\s");

        String name, title, date, year, month, day, time;

        name = stChange[0];
        title = stChange[1];
        date = stChange[2];

        year = date.substring(0,4);
        month= date.substring(4,6);
        day= date.substring(6,8);
        time = stChange[3];

        System.out.println(name +"님.");
        switch (month) {
            case "12" :
            case "01" :
            case "02" :
                System.out.println("한파의 연속인 1월 입니다.");
                break;
            case "03" :
                System.out.println("봄의 기운이 느껴지는 3월 입니다.");
                break;
            case "04" :
                System.out.println("새싹이 피어나는 4월 입니다.");
                break;
            case "05" :
                System.out.println("계절의 여왕 5월 입니다.");
                break;
            case "06" :
                System.out.println("활동하기 좋은 6월 입니다.");
                break;
            case "07" :
                System.out.println("휴가가 기다려지는 7월 입니다.");
                break;
            case "08" :
                System.out.println("무더운 8월 입니다.");
                break;
            case "09" :
                System.out.println("선선한 9월 입니다.");
                break;
            case "10" :
                System.out.println("천고마비의 계절 10월 입니다.");
                break;
            case "11" :
                System.out.println("쓸쓸한 늦가을 11월 입니다.");
                break;
            default:
                System.out.println("계절을 잘 못 입력 했습니다.");
        }
        System.out.println("아래와 일정으로" + title + "를 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.");
        System.out.println("===== 행사안내 ======");
        System.out.println("행사안내 : " + title);
        System.out.println("일시 : " + year + "년 " + month +"월 " + day + "일");
        System.out.println("시간 : " + time + "시");
    }
}
