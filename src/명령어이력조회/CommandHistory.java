package 명령어이력조회;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
Date : 2023-09-01
Author : J.H.Hwang
Purpose :  큐(Queue)를 설명하는 예제 프로그램입니다.
 */
public class CommandHistory {
    Queue<String> queue = new LinkedList<>();
    final static int MAX_SIZE = 10;
    public static void main(String[] args) {
        CommandHistory history = new CommandHistory();
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
        while(true) {
            System.out.print("$ ");
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine().trim();  // .trim() :  입력 받은 문자열 앞/뒤 의 공백 제거
            if(cmd.equalsIgnoreCase("q")) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0); // 프로그램 강제 종료
            } else if(cmd.equalsIgnoreCase("help")) {
                System.out.println("help - 도움!");
                System.out.println("q/Q - 프로그램 종료");
                System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 보여 줍니다.");
            } else if(cmd.equalsIgnoreCase("history")) {
                
            }
        }

    }
}
