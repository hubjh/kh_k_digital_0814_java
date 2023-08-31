package 컴페어러블;
/*
Date : 2023-08-31
Author : J.H.Hwang
Purpose :  Comparable을 설명하는 프로그램입니다.
 */
public class CarComp implements Comparable<CarComp> {
    public String modelName;
    public int modelYear;
    public String color;

    public CarComp(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    // 반환 값이  1이면 정렬 해야 될 조건
    // 반환 값이  0이면 정렬 조건은 아니지만 set을 사용하는 경우 중복제거 조건
    // 반환 값이 -1이면 정렬 조건이 아님

    public int compareTo(CarComp o) {
        if(this.modelYear > o.modelYear) return 1;  // 연식으로 오름차순 정렬
        else {
            if(this.modelYear == o.modelYear) {
//                return this.color.compareTo(o.color);  // 사전 순 정렬
                return 0;   // return 0 면 중복 되는 것을 다 지워버림
            }
        }
        return -1;
    }
}
