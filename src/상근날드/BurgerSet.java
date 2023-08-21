package 상근날드;

import java.util.Scanner;

/*
Date : 2023-08-21
Author : J.H.Hwang
Purpose : 상근날드 코딩테스트 프로그램입니다.

## 문제

상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다. 주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라, 세트로 구매하면, 가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.

햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.

햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.

## 입력

입력은 총 다섯 줄이다. 첫째 줄에는 상덕버거, 둘째 줄에는 중덕버거, 셋째 줄에는 하덕버거의 가격이 주어진다. 넷째 줄에는 콜라의 가격, 다섯째 줄에는 사이다의 가격이 주어진다. 모든 가격은 100원 이상, 2000원 이하이다.

## 출력

첫째 줄에 가장 싼 세트 메뉴의 가격을 출력한다.
 */
public class BurgerSet {
    public static void main(String[] args) {
//        int burger1= 1000, burger2= 1200, burger3= 1500;
//        int drink1= 300, drink2=200;
//        int[] drinkArr = {drink1, drink2};
//        int[] burgerArr = {burger1, burger2, burger3};
//
//
//        int[][] arr = new int[2][3];
//
//        for (int i=0; i<drinkArr.length;i++) {
//            for (int j=0; j<burgerArr.length;j++){
//                arr[i][j] = drinkArr[i] + burgerArr[j];
////                System.out.println(arr[i][j]);
//            }
//        }
//    }
//}

        int[] menu = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 입력 : ");
        for(int i = 0; i < menu.length; i++) menu[i] = sc.nextInt();    // 햄버거 3개, 음료 2개 금액을 입력 받음
        int minBerger = menu[0];    // 햄버거 중에 제일 싼 메뉴를 찾기 위한 시작 값
        int minDrink = menu[3];     // 음료 중에 제일 싼 메뉴를 찾기 위한 시작 값
        for (int i = 0; i < menu.length; i++) {
            if(i < 3 && minBerger > menu[i]) minBerger = menu[i];
            if(i > 2 && minDrink > menu[i]) minDrink = menu[i];
        }
        System.out.println(minBerger + minDrink - 50);


    }
}

