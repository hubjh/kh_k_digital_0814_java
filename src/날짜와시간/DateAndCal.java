package 날짜와시간;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose :  Date & Calendar 클래스를 설명하는 프로그램입니다.
 */
// Date() : 운영체제로 부터 날짜와 시간 정보를 가져와 원하는 포맷 형태로 출력, 객체를 생성해야 함.
// 자바의 java.util에 패키지에 포함되어 있어 import를 해야 함
public class DateAndCal {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        // 원하는 포멧으로 변경
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(sdf.format(now));

        // yyyy : 년도를 4자리로 표시
        // yy : 년도를 2자리로 표시
        // MM : 월을 표시 (대문자임에 유의, 월이 2자리로 표시 됨 01 02 ...)
        // HH : 24시간제
        // hh : 12시간제
        // mm : 분을 출력

        // Date
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년MM월dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날 입니다.");
        f6 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
        f7 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(f1.format(now));
//        System.out.println(f2.format(now));
//        System.out.println(f3.format(now));
//        System.out.println(f4.format(now));
//        System.out.println(f5.format(now));
//        System.out.println(f6.format(now));
//        System.out.println(f7.format(now));

        // Calendar
        Calendar cnow = Calendar.getInstance();             // 운영체제로 부터 시간을 가져 옴
//        System.out.println(cnow.get(Calendar.YEAR));
//        System.out.println(cnow.get(Calendar.MONTH)+1);     // 인덱스임의 유의 해야 함 [0] ~ [n]
//        System.out.println(cnow.get(Calendar.DAY_OF_MONTH));    // 월에서 몇 번째 달인지
//        System.out.println(cnow.get(Calendar.DAY_OF_WEEK)); // 주에서 몇 번째 날인지
//        System.out.println(cnow.get(Calendar.AM_PM));
//        System.out.println(cnow.get(Calendar.HOUR));
//        System.out.println(cnow.get(Calendar.MINUTE));
//        System.out.println(cnow.get(Calendar.SECOND));

        // Calendar 클래스로 yyyy년MM월dd일 HH시mm분ss초 포멧과 동일하게 출력 하기
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        System.out.println(sdf.format(cnow.getTime()));

        System.out.println(cnow.getTime());

        Calendar date = Calendar.getInstance();
        int year = date.get(Calendar.YEAR);
        int mon = date.get(Calendar.MONTH) + 1;
        int day = date.get(Calendar.DAY_OF_MONTH);
        int isPM = date.get(Calendar.AM_PM);
        int hour = date.get(Calendar.HOUR);
        int minute = date.get(Calendar.MINUTE);
        int second = date.get(Calendar.SECOND);
        if(isPM == 0) hour += 12;
        System.out.printf("%d년 %02d월 %02d일 %02d시 %02d분 %02d초", year, mon, day, hour, minute, second);


    }
}
