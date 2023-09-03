package 자바연습하기2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human(1,"홍길동",170, 75);
        human.walk();
        human.speak();
        human.shakeHands();
        human.info();

        HashSet<String> hs = new HashSet<>();
        hs.add("가");
        hs.add("나");
        hs.add("다");
        hs.add("라");
        hs.add("마");

        System.out.println(hs.size());
        hs.iterator();

        HashMap<String, Integer> hm = new HashMap<>();      // Python 딕셔너리

        hm.put("가", 1);
        hm.put("나", 2);
        hm.put("다", 3);
        hm.put("라", 4);
        hm.put("마", 5);
        hm.put("바", 6);

        System.out.println(hm.size());
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.get("나"));

        for(String key : hm.keySet()) {
            System.out.println(key);
        }

        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);

        for(int el : ls) System.out.println(el);


    }
}
