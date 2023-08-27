package 자바연습하기;

public class Animals extends Things {
    boolean isAnimate;
    private static int aCount = 0;
    Animals() {
        isAnimate = true;
        aCount++;
    }
    public void state() {
        System.out.println("이것은 생물 입니다.");
    }
    public void count() {
        System.out.println("생성된 생물의 수 : " + aCount);
    }
}

class Fish extends Animals {
    boolean isFish;
    Fish() {
        isFish = true;
    }
    public void state() {
        System.out.println("이것은 물고기 입니다.");
    }
}
