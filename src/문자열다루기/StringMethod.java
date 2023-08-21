package 문자열다루기;
/*
Date : 2023-08-21
Author : J.H.Hwang
Purpose : 문자열을 설명하는 프로그램입니다.
 */
// 자바는 문자열을 나타내는 자료형은 String이며, 참조 타입 자료형 입니다.
// equals : 두 개의 문자열이 동일한지 비교하여 결과값을 리턴함(true / false), == 문자열 주소가 같은지를 물어봄
// indexOf : 문자열에서 특정 문자가 시작되는 인덱스를 반환
// contains : 문자열에서 특정 문자열이 포함되어 있는지 여부 확인
// charAt : 문자열에서 특정 위치의 문자를 반환
// replaceAll : 문자열 중에서 특정 문자열을 다른 문자열로 변경
// substring : 문자열 중 특정 부분을 뽑아 낼 때 사용
// toUpperCase / toLowerCase : 문자열 전부를 대문자 / 소문자로 바꿔준다.
// trim : 문자열 앞뒤의 공백을 제거
// split : 문자열을 특정 구분자로 분리하는 메소드
// toCharArray() : 문자열을 문자 배열로 변환
public class StringMethod {
    public static void main(String[] args) {
        String a = "hello";
        String a2 = "hello java";
        String b = " java";
        String c = "Hello";
        String d = new String("hello");

        System.out.println(a.equals(b));
        System.out.println(a.equals(d));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));  // 문자열을 비교하는데 대소문자 구분 안함
        System.out.println(a.indexOf("l")); // 문자가 시작되는 인덱스 반환
        System.out.println(a.indexOf("lo")); // 문자가 시작되는 인덱스 반환
        System.out.println(a.indexOf("lt")); // 문자가 시작되는 인덱스 반환 문자가 없으면 -1

        System.out.println(a2.contains("java"));
        System.out.println(a2.charAt(4));
        String e = "Hello Java";
        System.out.println(e.replace("Java", "Python..."));     // replace는 target replaceAll은 regax
        // 문자열만 바꾸기 vs 문자열+정규표현식을 넣을 수 있다.
        System.out.println(e.substring(4,7));   // 매개변수로 넘겨준 인덱스만큼 문자열을 잘라줌
        System.out.println(e.toUpperCase());    // 대문자
        System.out.println(e.toLowerCase());    // 소문자
        String oldStr = "      자바 프로그래밍    ";
        System.out.println(oldStr.trim());
        String time = "10:23:45";
        String[] modifyTime = time.split(":");
        System.out.println(modifyTime[2]);
        for(String eee : modifyTime) System.out.println(eee + " ");
        System.out.println();

        // 문자열 포맷팅을 출력을 위해서 사용
        System.out.printf("I eat %d apples.\n", 3);

        String test = String.format("I ead %d apples.", 3);
        System.out.println(test);

        String testName = "James";
        char[] chName = testName.toCharArray();

        for(char eCh : chName) System.out.println(eCh + " ");

    }
}
