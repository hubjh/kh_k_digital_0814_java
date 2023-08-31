package 학생성적정렬;

public class Student implements Comparable<Student> {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        if(this.grade > o.grade) return 1;  // 내림차순 정렬
        else {
            return this.name.compareTo(o.name); // 사전순 정렬
        }
    }
}

