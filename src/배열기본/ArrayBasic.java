package 배열기본;
/*
Date : 2023-08-21
Author : J.H.Hwang
Purpose : 자바의 배열을 설명하기 위한 프로그램입니다.
 */
// 자바의 배열은 동일한 데이터 요소들을 연속적으로 저장하는 자료 구조
// 인덱스를 사용해서 각 요소를 접근할 수 있습니다. (인덱스는 0부터 시작 합니다.)
// 배열은 크기를 먼저 지정 해야 합니다.
// 타입[] 배열이름 = new 타입[배열길이]
public class ArrayBasic {
    public static void main(String[] args) {
        // 배열의 크기를 할당하고 이후에 초기화 하는 방법
        int[] grade1 = new int[3];  // heap 영역에서 정수 3개를 저장할 메모리 공간을 확보
        grade1[0]   =   85;
        grade1[1]   =   99;
        grade1[2]   =   77;
//        grade1[3]   =   33;

//        for(int i = 0; i < grade1.length; i++) {
//            System.out.println(grade1[i] + " ");
//        }
//
//        // 향상된 for 문 : 주어진 배열 등의 크기를 자동 순회를 함
//        for(int e : grade1) {
//            System.out.println(e + " ");
//        }

        // 이미 정해진 값을 배열에 대입 하는 경우는 크기와 new를 사용 하지 않아도 된다.
//        int[] odd = {1,3,5,7,9};
//        String[] weeks = {"월요알", "화요일", "수", "목", "금", "토", "일"};   // weeks 변수는 배열 주소를 가리키고 배열의 각각의 요소는 문자열의 주소를 가리킨다.
//        char[] weeks2 = {'월', '화', '수', '목', '금', '토', '일'}; // weeks2 변수는 배열 주소를 가리키고 배열의 각각의 요소는 char형 데이터를 가지고 있다.

        int[] grade2 = {88, 99, 56};    // 이미 값을 알고 있는 경우
        int[] grade3 = new int[] {99, 88 ,88};  // head에 저장 됨
        int[] grade4;   // 객체 타입의 참조 변수 이므로 실제 객체의 주소로 받아야 함
        grade4 = new int[4];
        grade4[0] = 100;
        grade4[1] = 88;
        grade4[2] = 77;
        grade4[3] = 55;

        int sum = 0;    // 총점을 구하기 위한 변수

        for(int e : grade4) {
            System.out.print(e + " ");
            sum += e;
        }
        System.out.println();
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", (double)sum / grade4.length);
    }
}
