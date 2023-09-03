package 자바연습하기2;

public class Unit {
    int age;
    String name;
    int height;
    int weight;

    public Unit(int age, String name, int height, int weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

interface Action {
    void speak();
    void shakeHands();
    void walk();
    void info();
}
