package 커피메뉴읽기;

import 자바파이널실습문제2.MenuInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

/*
Date : 2023-09-05
Author : J.H.Hwang
Purpose :  파일읽기 하는 예제 프로그램입니다.
 */
public class CoffeeMenuRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/자바파이널실습문제2/coffeeSave.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Map<String, MenuInfo> map = new HashMap<>();
        map = (Map<String, MenuInfo>) ois.readObject();
        for(String key : map.keySet()) {
            System.out.println("메뉴 : " + map.get(key).getName());
            System.out.println("가격 : " + map.get(key).getPrice());
            System.out.println("분류 : " + map.get(key).getCategory());
            System.out.println("설명 : " + map.get(key).getDescription());
            System.out.println("--------------------------------------------------");
        }
    }
}
