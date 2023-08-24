package 번호판만들기;
/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 번호판의 길이를 추정하는 프로그램입니다.
 */
// 숫자를 입력
// 해당 숫자가 몇 칸을 차지 하는 지를 출력 하는 문제
import java.util.Scanner;
public class AddressMake {
    public static void main(String[] args) {
        // 각 숫자가 차지하는 자리수를 배열로 만들기
        int[] numSize = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        int sum = 0;    // 입력 받은 수가 차지 하는 총 자리수
        Scanner sc = new Scanner(System.in);
        while (true) {
            String number = sc.next();
            if (number.equals("0")) break;   // 0이 입력 되면 끝남
            for (int i = 0; i < number.length(); i++) {
                sum += numSize[number.charAt(i) - '0'] + 1; // 1을 더하는 각 숫자마다 여백이 1칸
            }
            System.out.println(sum + 1);    // 1을 더하는 이유는 처음 공백을 더해 줌
            sum = 0;    // 다음 계산을 위해 sum 변수를 초기화 함
        }
    }
}









    // ============== 내가 푼 것 ==========================
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            int cnt = 0, lcnt = 0;
//            System.out.print("0 ~ 9999 숫자를 입력 하세요. : ");
//            String ss = sc.next();
//            char[] array = ss.toCharArray();
//            if(ss.charAt(0)=='-') break;
//
//            for(char e : array) {
//                if(array.length == 1 && e == '0') {
//                    cnt = -2;
//                    break;
//                } else {
//                    if (e == '0') lcnt += 4;
//                    else if (e == '1') lcnt += 2;
//                    else lcnt += 3;
//                    cnt = array.length - 1;
//                }
//            }
//            System.out.println("여백의 길이는 : " + (cnt + lcnt + 2) + "cm 입니다.");
//            }
//        }
//    }