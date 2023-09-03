package 자바연습하기2;

public class Human extends Unit implements Action {

    public Human(int age, String name, int height, int weight) {
        super(age, name, height, weight);
    }

    @Override
    public void speak() {
        System.out.println(name + "이 말을 합니다.");
    }

    @Override
    public void shakeHands() {
        System.out.println(name + "이 손을 흔듭니다.");
    }

    @Override
    public void walk() {
        System.out.println(name + "이 걷습니다.");
    }

    @Override
    public void info() {
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
    }

}
