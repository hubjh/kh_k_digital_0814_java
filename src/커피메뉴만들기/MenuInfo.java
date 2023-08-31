package 커피메뉴만들기;
/*
Date : 2023-08-31
Author : J.H.Hwang
Purpose :  해쉬맵으로 커피메뉴를 만드는 프로그램입니다.
 */
public class MenuInfo {
    String coffee;  // 메뉴명
    int price;  // 가격
    String category;    // 분류
    String description; // 설명

    public MenuInfo(String coffee, int price, String category, String description) {
        this.coffee = coffee;
        this.price = price;
        this.category = category;
        this.description = description;
    }
}
