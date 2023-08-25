package 저항구하기;

import java.util.Scanner;

/*
Date : 2023-08-25
Author : J.H.Hwang
Purpose : 저항의 색띠에 따른 저항 값을 구하는 프로그램입니다.
 */
public class Resistance {
    
    public static void main(String[] args) {
        String[] colorValue = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        String[] colors = new String[3];
        int[] valueArr = new int[3];
        int cnt = 0, intValue = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("색깔을 입력해주세요.");

        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "번 색을 입력해주세요 : ");
            String color = sc.next();
            colors[i] = color;
        }
        for(String e : colors) { // System.out.println(e);
            cnt++;
            for(int i = 0; i < colorValue.length ; i++) {
                if(e.equalsIgnoreCase(colorValue[i]) && cnt <= 2) {
                    System.out.print(i);
                }
                if(e.equalsIgnoreCase(colorValue[i]) && cnt > 2) {
                    for(int j = 0; j < i; j++) {
                        System.out.print('0');
                    }
                }
            }
        }

//        for (int i = 0; i < colors.length; i++) {
//            for (int j = 0; j < colorValue.length; j++) {
//                if (colors[i].equalsIgnoreCase(colorValue[j])) {
//                    valueArr[i] = j;
//                }
//            }
//        }
//        for(int i = 0; i < valueArr.length - 1; i++) {
//            System.out.print(valueArr[i]);
//        }
//        System.out.print((int)Math.pow(10, valueArr[valueArr.length - 1]));
//        for(int d : valueArr) System.out.print(d);
    }
}
