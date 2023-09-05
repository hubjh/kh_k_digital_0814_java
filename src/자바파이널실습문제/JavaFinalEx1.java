package 자바파이널실습문제;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
Date : 2023-09-05
Author : J.H.Hwang
Purpose :  텍스트 파일을 읽어서 총점이 높은 사람 순으로 이름과 총점을 구하는 프로그램입니다.
 */
public class JavaFinalEx1 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/자바파이널실습문제/source.txt");
        } catch (FileNotFoundException e) {
            System.out.println("읽을 파일을 찾지 못했습니다.");
        }
        assert inputStream != null;
        Scanner sc = new Scanner(inputStream);

        HashMap<String,Integer> map = new HashMap<>();

        while (sc.hasNext()) {  // 읽을 내용이 있으면 참이 됨
            String line = sc.nextLine();    // 문자열을 '\n' 을 기준으로 읽음
            String[] spLine = line.split(" ");
            String name = spLine[0];   // 이름
            int totalScore = (Integer.parseInt(spLine[1]) + Integer.parseInt(spLine[2]) +Integer.parseInt(spLine[3]));
            map.put(name, totalScore);
        }
        List<Integer> valueList = new ArrayList<>(map.values());
        valueList.sort(Integer::compareTo);
        for(Integer value : valueList) {
            for (String key : map.keySet()) {
                if (map.get(key) == value) {
                    System.out.println("total : " + value + " | name : " + key);
                }
            }
        }
    }
}
