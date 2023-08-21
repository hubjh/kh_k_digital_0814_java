package 중복없는로또번호;
/*
Date : 2023-08-21
Author : J.H.Hwang
Purpose : 중복없는 로또 번호를 6개 뽑는 프로그램입니다.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// 1 ~ 45 사이의 임의의 수 6개를 생성해야 함. (입력은 받지 않음, Math.random() => 0.1 ~ 0.9999
// int val = (int) ((Math.random() * 45) + 1);
// 단 중복 제거
// 생성된 val값을 배열에 담을 때 배열 내에 해당하는 값이 있는지 확인 필요
// 배열은 6개
// 반복횟수는 정할 수 없음 (while(true) ==> 탈출 조건이 있어야 함 (중복 되지 않은 번호 6개가 저장되면 탈출 break)
public class RandomLotto {
    public static void main(String[] args) {

        // =================== 내가 한 것 =========================

//        int[] arr = {0, 0, 0, 0, 0, 0};
//        int num = 0;
//        int dump_count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            while (true) {
//                num++;
//                int val = (int) ((Math.random() * 14) + 1);
//                for (int j = 0; j < i; j++) {
//                    if (arr[j] == val) {
//                        dump_count++;
//                        continue;
//                    }
//                }
//                System.out.println("중복 횟수 = " + dump_count);
//                arr[i] = val;
//                break;
//            }
//        }
//        for (int e : arr) System.out.println(e);
//        System.out.println("숫자 뽑은 횟수 = " + num);


//        ====================== 강사님이 푼 것 ==========================
//        int[] lotto = new int[6];
//        int tmp, index = 0;    // 임시 로또 번호
//        boolean isExist = false;
//
//        while (true) {
//            tmp = (int) ((Math.random() * 45) + 1);
//            for (int i = 0; i < lotto.length; i++) {
//                if (lotto[i] == tmp) isExist = true;
//            }
//            if (!isExist) lotto[index++] = tmp;
//            if (index == 6) break;
//            isExist = false;
//        }
//        for (int e : lotto) System.out.print(e + " ");

        // ====================== ArrayList ==========================
//        List<Integer> list = new ArrayList<>();
//        int tmp;
//        while (true) {
//            tmp = (int) ((Math.random() * 45) + 1);
//            if(!list.contains(tmp)) {
//                list.add(tmp);
//            }
//            if(list.size() == 6) break;
//        }
//        System.out.println(list);


        //  ================== Set : 자바에서 사용 집합 개념 =======================
//        HashSet<Integer> set = new HashSet<>();
//        while (true) {
//            int tmp = (int) ((Math.random() * 45) + 1);
//            set.add(tmp);
//            if(set.size() == 6) break;
//        }
//        System.out.println(set);

    }
}




