package 스트림예제2번;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

/*
Date : 2023-09-04
Author : J.H.Hwang
Purpose :  스트림을 설명하는 프로그램입니다.
 */
// 반복자 스트림 forEach() : 내부 반복자, 스트림 요소에 대한 순차 접근을 제공하며, 최종 연산에 해당 합니다.
public class StreamEx2 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>(Arrays.asList("고유림", "나희도", "백이진"));
//        for(String e : list) System.out.print(e + " ");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String name = iterator.next();
//            System.out.print(name + " ");
//        }
//
//        list.forEach(e->System.out.print(e + " "));
//        list.forEach(e->System.out.print(e + " "));

        List<Student> list = Arrays.asList(
                new Student("고유림", 89),
                new Student("나희도", 78),
                new Student("우영우", 66),
                new Student("최수연", 78),
                new Student("권민우", 75),
                new Student("백이진", 98)
        );
//        list.forEach(s->{
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        });
//
//        for(Student s : list) {
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        }
//
//        list.parallelStream().forEach(s -> {    // 내부 반복자를 이용한 병렬 처리
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        });

        // ================== 평균 구하기 ======================
        double average = list.stream()  // stream 생성
                .mapToInt(Student::getScore)     // 메소드 참조, 중간 연산             map :  입력 받은 값을 만들어서 다시 정수 타입으로 뱉어냄
                .average()  // 중간 연산
                .orElse(0.0); // 최종 연산

        System.out.println("평균 점수 : " + average);

        IntStream stream = IntStream.rangeClosed(1, 100);
        System.out.println("합계 : "+ stream.sum());
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
