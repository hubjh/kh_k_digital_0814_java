package 자바파이널실습문제2;

import java.io.*;
import java.nio.charset.StandardCharsets;
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
    public static void main(String[] args) throws IOException {
        makeMenu();     // 같은 클래스 내에 있어서 클래스 이름을 안적어도 된다.
        CoffeeMenuList.selectMenu();    // == selectMenu();
    }
    static void makeMenu() {        // 파일 입력 =========
        String fileName = "src/자바파이널실습문제2/coffeeSave.txt";
        try {
            Scanner sc = new Scanner(new File(fileName));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] txtFile = line.split(",");
                menuInfoMap.put(
                        txtFile[0].trim(),
                        new MenuInfo(
                                txtFile[1].trim(),
                                Integer.parseInt(txtFile[2].trim()),
                                txtFile[3].trim(),
                                txtFile[4].trim()
                        ));


            }
        } catch (IOException e) {
        }
        if (menuInfoMap.size() <= 0) {
            menuInfoMap.put("Americano", new MenuInfo("Americano", 2500, "Coffee", "기본커피"));
            menuInfoMap.put("Espresso", new MenuInfo("Espresso", 3000, "Coffee", "진한커피"));
            menuInfoMap.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유 포함"));
                }
    }
    public static <FileOutputStream, BufferedWriter> void selectMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        String key = "";        // key 를 받기 위한 문자열 변수
        while (true) {
            System.out.println("=".repeat(10) + "메뉴 리스트" + "=".repeat(10));
            System.out.print("[1]메뉴보기 [2]메뉴조회 [3]메뉴추가 [4]메뉴삭제 [5]메뉴수정 [6]종료 : ");
            int selMenu = sc.nextInt();
            switch (selMenu) {
                case 1:
                    System.out.println("=".repeat(10) + " 메뉴보기 " + "=".repeat(10));
                    for (String e : menuInfoMap.keySet()) {
                        System.out.println("메뉴 : " + menuInfoMap.get(e).name);
                        System.out.println("가격 : " + menuInfoMap.get(e).price);
                        System.out.println("분류 : " + menuInfoMap.get(e).category);
                        System.out.println("설명 : " + menuInfoMap.get(e).description);
                        System.out.println("-".repeat(28));
                    }
                    break;
                case 2:
                    System.out.println("조회할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    // 포함여부를 확인하는 메소드 containsKey(key) map 내에 해당 키가 있는지 확인하여 결과를 반환
                    if (menuInfoMap.containsKey(key)) {
                        System.out.println("메뉴 : " + menuInfoMap.get(key).name);
                        System.out.println("가격 : " + menuInfoMap.get(key).price);
                        System.out.println("분류 : " + menuInfoMap.get(key).category);
                        System.out.println("설명 : " + menuInfoMap.get(key).description);
                    } else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;
                case 3:
                    System.out.println("추가 할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if (menuInfoMap.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재 합니다.");
                    } else {
                        System.out.print("가격 입력 :");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String description = sc.nextLine();
                        menuInfoMap.put(key, new MenuInfo(key, price, category, description));
                    }
                    break;
                case 4:
                    System.out.println("삭제할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if (menuInfoMap.containsKey(key)) {
                        menuInfoMap.remove(key);
                        System.out.println(key + " 메뉴를 삭제 하였습니다. ");
                    } else {
                        System.out.println("삭제할 메뉴가 없습니다.");
                    }
                    break;
                case 5:
                    System.out.println("수정할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if (menuInfoMap.containsKey(key)) {
                        System.out.print("가격 입력 :");
                        int price = sc.nextInt();
//                        sc.nextLine();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String description = sc.nextLine();
                        // 키 값이 동일하고 값이 변경되는 경우에 replace()를 사용
                        menuInfoMap.replace(key, new MenuInfo(key, price, category, description));
                    } else {
                        System.out.println("수정 할 메뉴가 없습니다.");
                    }
                    break;
                case 6:
                    System.out.println("메뉴를 종료 합니다.");
//                    System.exit(0);   // 강제 종료

                    // 파일 출력 =======
                    String txtStream = "";
                    String filename = "src/자바파이널실습문제2/coffeeSave.txt";
                    for (String e : menuInfoMap.keySet()) {
                        txtStream += (
                                e + ", "
                                + menuInfoMap.get(e).name + ", "
                                + menuInfoMap.get(e).price + ", "
                                + menuInfoMap.get(e).category + ", "
                                + menuInfoMap.get(e).description+"\n");
                    }
                    java.io.FileOutputStream fos = new java.io.FileOutputStream(filename);
                    fos.write(txtStream.getBytes());
                    fos.flush();
                    fos.close();

                    return;
                default:
                    System.out.println("선택하신 메뉴가 없습니다.");
            }
        }
    }
}
