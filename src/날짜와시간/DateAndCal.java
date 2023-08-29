package 날짜와시간;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Date : 2023-08-29
Author : J.H.Hwang
Purpose :  Date& Calendar 클래스를 설명하는 프로그램입니다.
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

        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년MM월dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날 입니다.");
        f6 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
        f7 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));


    }
}
