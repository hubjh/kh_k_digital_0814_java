package 알람45분일찍울리기;
/*
Date : 2023-08-18
Author : J.H.Hwang
Purpose : 초급 알고리즘 문제로 입력한 시간과 분보다 45분 일찍 알람이 울리는 프로그램입니다.
 */
import java.util.Scanner;

// 조건 :
// 1. 초기 시간과 분값을 입력 받는다 (스캐너)
// 2. 입력 받은 시간 보다 45분 일찍 알람이 울려야 한다.
// 3. 시간은 0 ~ 23, 분은 0 ~ 59
public class Alarm45 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);    // 입력을 받기 위해 스캐너 생성
//        int inputHour, inputMinute, hourToMinute, totalMinute, resultHour, resultMinute;
//
//        // 1. 초기 시간을 입력 받는다.
//        while (true) {
//            System.out.print("시간을 입력 하세요 : ");
//            int hour = sc.nextInt();
//            if (hour >= 0 && hour < 24) {
//                inputHour = hour;
//                break;
//            }
//            System.out.println("시간을 잘 못 입력하셨습니다.");
//        }
//        System.out.println();
//        // 2. 초기 분을 입력 받는다.
//        while (true) {
//            System.out.print("분을 입력 하세요 : ");
//            int minute = sc.nextInt();
//            if (minute >= 0 && minute < 60) {
//                inputMinute = minute;
//                break;
//            }
//            System.out.println("분을 잘 못 입력하셨습니다.");
//        }
//        // 3. 입력 받은 시간을 분으로 바꾼다.
//        hourToMinute = inputHour * 60;
//        // 4. 입력 받은 시간 보다 45분 일찍 알람이 울려야 한다.
//        totalMinute = hourToMinute + inputMinute - 45;
//        // 5. 총 분수가 45보다 낮다면 1440 - 분 값으로 해준다
//        if (totalMinute < 45) {
//            totalMinute = 24 * 60 - totalMinute; //
//        }
//        // 5. 45분을 뺀 분값을 시간과 분으로 되 돌린다.
//        resultHour = totalMinute / 60;
//        if (resultHour == 24) resultHour = 0;
//        resultMinute = totalMinute % 60;
//
//        // 6. 시간을 출력한다.
//        System.out.printf("알람이 울리는 시간 : %02d시 %02d분 입니다.\n",resultHour, resultMinute);
//        System.out.println(59/60);
//
//    }


    int hour, min, calc;
        Scanner sc = new Scanner(System.in);
            System.out.print("시간 입력 : ");
        hour = sc.nextInt();
        min = sc.nextInt();
        calc = (hour * 60) + min;
            if (calc < 45) {
            calc = (24 * 60) + min;
        }
        calc -= 45;
            System.out.printf("%d %d\n", (calc / 60), (calc % 60));
    }
}
