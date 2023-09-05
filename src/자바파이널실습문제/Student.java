package 자바파이널실습문제;

public class Student implements Comparable<Student> {
    String name;
    int totalGrade;

    public Student(String name, int totalGrade) {
        this.name = name;
        this.totalGrade = totalGrade;
    }

    @Override
    public int compareTo(Student o) {
        if(this.totalGrade < o.totalGrade) return 1;
        else if (this.totalGrade == o.totalGrade) {
            return this.name.compareTo(o.name);     // 사전순 정렬
        }
        return -1;
    }
}

//public class Student implements Comparable<Student> {
//    String name;
//    int grade;
//
//    public Student(String name, int grade) {
//        this.name = name;
//        this.grade = grade;
//    }
//
//    @Override
//    public int compareTo(학생성적정렬.Student o) {
//        if(this.grade < o.grade) return 1;  //
//        else if (this.grade == o.grade){
//            return this.name.compareTo(o.name); // 사전순 정렬
//        }
//        return -1;
//    }
//}

