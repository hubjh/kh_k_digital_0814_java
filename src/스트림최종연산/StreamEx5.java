package 스트림최종연산;

import java.util.Optional;
import java.util.stream.Stream;

/*
Date : 2023-09-04
Author : J.H.Hwang
Purpose :  스트림 최종연산을 설명하는 프로그램입니다.
 */
// 요소의 소모 :
public class StreamEx5 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("넷","둘","셋","하나");
        Stream<String> stream2 = Stream.of("넷","둘","셋","하나");
        Optional<String> rst1 = stream1.reduce((s1, s2)->s1 + "++" + s2);   // Optional : NullPointerException 감지
        rst1.ifPresent(e->System.out.print(e + " "));
        System.out.println();
        String rst2 = stream2.reduce("시작", (s1, s2)->s1 + "++" + s2);
        System.out.println(rst2);
    }
}
