package 프로그래머스_자바;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

/*
Date : 2023-09-05
Author : J.H.Hwang
Purpose :  프로그래머스 자바 코딩테스트 프로그램입니다.
 */
public class JavaEx1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4364,74,5,13};
        Solution solution = new Solution();
        System.out.print(Arrays.toString(solution.solution(arr)));
    }
}
class Solution {
    public int[] solution(int[] arr) {
        List<int[]> intList = asList(arr);
        System.out.println(Arrays.toString(intList.get(0)));

        return arr;
    }
}


//class Solution {
//    public int[] solution(int[] arr) {
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0 ; j < arr.length - i - 1 ; j++) {
//                if(arr[j] < arr[j+1]) {
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        if(arr.length == 1) {
//            int[] arr2 = new int[1];
//            arr2[0] = -1;
//            return arr2;
//        } else {
//            int[] arr2 = new int[arr.length -1];
//            for(int i = 0; i < arr.length -1; i++) {
//                arr2[i] = arr[i];
//            }
//            return arr2;
//        }
//    }
//}
