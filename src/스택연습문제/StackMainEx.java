package 스택연습문제;

import java.util.Scanner;
import java.util.Stack;

/*
Date : 2023-09-01
Author : J.H.Hwang
Purpose :  스택(Stack)을 설명하는 예제 프로그램입니다.
 */
// 스택을 이용해서 열림괄호 닫힘괄호 체크 하기
public class StackMainEx {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = sc.next();
        // 입력 받은 문자열 길이 만큼 반복 순회
        for(int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if(ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if(!stack.empty()) stack.pop(); // 닫힌 괄호 일 때 pop
                else {
                    System.out.println("괄호가 일치 하지 않습니다.");
                    return;
                }
            }
        }
        if(stack.isEmpty()) {
            System.out.println("괄호가 일치 합니다.");
        } else {
            System.out.println("괄호가 일치 하지 않습니다.");
        }
    }
}