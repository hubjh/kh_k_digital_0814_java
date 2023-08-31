package 학생성적정렬;

import java.util.*;

/*
Date : 2023-08-31
Author : J.H.Hwang
Purpose :  학생 성적을 높은 순서대로 정렬하는 프로그램입니다.
 */
// 미리 입력 받아 놓고 시작
// 5명의 학생에 대해 이름과 성적을 입력 성적이 높은 사람 순으로 정렬하고 성적이 같으면 이름순 정렬
public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<Student> student = new TreeSet<>();
//        List<Student> student = new ArrayList<>();
        student.add(new Student("aaa", 95));
        student.add(new Student("bbb", 77));
        student.add(new Student("cc", 88));
        student.add(new Student("ddd", 66));
        student.add(new Student("ee", 33));
        student.add(new Student("ffff", 89));

        for(Student e : student) System.out.println(e.grade + " " + e.name);
    }
}
