package 스트림중개연산;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Date : 2023-09-04
Author : J.H.Hwang
Purpose :  스트림 중개연산을 설명하는 프로그램입니다.
 */
// 생성된 스트림은 중간 연산을 통해 또 다른 스트림으로 변환 됩니다.
// 1. 필터링 :
// - filter() : 주어진 조건에 맞는 요소만으로 구성된 새로운 스트림 생성
// - distinct() : 중복된 요소가 제거된 새로운 스트림 생성

// 2. 스트림 변환 :
// - map() : 해당 스트림의 요소들을 함수에 인수로 전달하여, 그 반환 값으로 이루어진 새로운 스트림을 만듬
// - flatMap() : 각 요소를 변환하여 중첩된 스트림들을 평면화하여 새로운 스트림을 생성합니다.

// 3. 제한
// - limit() : 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로운 스트림 생성
// - skip() : 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지 요소만으로 이루어진 새로운 스트림 생성

// 4. 정렬
// - sorted() : 메소드는 해당 스트림을 주어진 비교자를 이용하여 정렬
// -
public class StreamEx4 {
    public static void main(String[] args) {
//        IntStream stream1 = IntStream.of(7,5,5,2,1,2,3,4,5,6);
//        IntStream stream2 = IntStream.of(7,5,5,2,1,2,3,4,5,6);
//        // 스트림의 중복된 요소를 제거함
//        stream1.distinct().forEach(e->System.out.print(e + " "));
//        System.out.println();
//        // 조건에 맞는 요소만으로 구성된 새로운 스트림 생성
//        stream2.filter(e->e % 2 != 0).forEach(e->System.out.print(e + " "));

//        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
//        stream.map(String::length).forEach(System.out::println);
////        stream.map(e->e.length()).forEach(e->System.out.println(e));
//        System.out.println();
//        Stream<String> stream4 = Stream.of("I study hard", "You study Java", "I am hungry");
//        stream4.flatMap(e->Stream.of(e.split(" "))).forEach(System.out::println);

//        IntStream stream1 = IntStream.range(0, 10);
//        IntStream stream2 = IntStream.range(0, 10);
//        IntStream stream3 = IntStream.range(0, 10);
//
//        //  전달된 요소의 개수만 제외 : 0 ~ 3, 4개
//        stream1.skip(4).forEach(System.out::print);
//        System.out.println();
//        //  전달된 요소의 개수만큼의 새로운 스트림 반환 0 ~ 4, 5개
//        stream2.limit(5).forEach(System.out::print);
//        System.out.println();
//        // 둘 다 사용해본 경우
//        stream3.skip(3).limit(5).forEach(System.out::print);

        Stream<String> stream1 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        Stream<String> stream2 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        stream1.sorted().forEach(s->System.out.print(s + " "));
        System.out.println();
        stream2.sorted(Comparator.reverseOrder()).forEach(s->System.out.print(s + " "));


    }
}
