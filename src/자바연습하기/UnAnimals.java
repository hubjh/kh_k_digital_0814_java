package 자바연습하기;

public class UnAnimals extends Things{
    boolean isUnAnimate;
    private static int unCount = 0;

    UnAnimals() {
        isUnAnimate = true;
        unCount++;
    }
    public void state() {
        System.out.println("이것은 무생물 입니다.");
    }
    public void count() {
        System.out.println("생성된 무생물의 수 : " + unCount);
    }
}

class Mineral extends UnAnimals {
    boolean isMineral;
    Mineral() {
        isMineral = true;
    }
    public void state() {
        System.out.println("이것은 광물 입니다.");
    }
}