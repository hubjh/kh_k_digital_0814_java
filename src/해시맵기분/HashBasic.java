package 해시맵기분;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Date : 2023-08-31
Author : J.H.Hwang
Purpose :  해쉬맵 알고리즘을 설명하는 프로그램입니다.
 */
public class HashBasic {
    public static void main(String[] args) {
        // Key, Value
        Map<String, Integer> map = new HashMap<>();
        // 객체 저장 : key, value
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 70);    // 키가 같기 때문에 나중에 저장된 값으로 대체 된다.
        System.out.println("총 Entry 수 : " + map.size());
        // 객체 찾기 : get(key), 지정된 키에 대한 값을 반환 합니다.
        System.out.println(map.get("우영우"));
        System.out.println(map.keySet());
        System.out.println(map.values());

        // 객체 삭제 : 키 값으로 해당 Entry를 삭제
        map.remove("최수연");

        // 향상된 for문으로 map 순회
        for(String key : map.keySet()) System.out.print(key + " ");
        System.out.println();
        for(Integer value : map.values()) System.out.print(value + " ");
        System.out.println();
        for(String key : map.keySet()) {
            System.out.println(key + "\t" + map.get(key));
        }
        // iterator(반복자)를 사용하는 방법
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + "\t" + value);
        }



    }
}
