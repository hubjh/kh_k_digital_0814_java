package 커피메뉴만들기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Date : 2023-08-31
Author : J.H.Hwang
Purpose :  해쉬맵으로 커피메뉴를 만드는 프로그램입니다.
 */
// HashMap으로 커피 메뉴 리스트 만들기
public class CoffeeMenuList {
    // 문자열로 만들어진 키와 커피의 여러가지 정보가 포함된 객체를 값으로 사용
    static Map<String, MenuInfo> menuInfoMap = new HashMap<>();
    public static void main(String[] args) {

    }
    static void makeMenu() {
        menuInfoMap.put("Americano", new MenuInfo("Americano", 2000, "Coffee", "기본커피"));
        menuInfoMap.put("Espresso", new MenuInfo("Espresso", 2500, "Coffee", "진한커피"));
        menuInfoMap.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유 포함"));
    }
    static void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String key;

    }
}
