package 자바연습하기;

public class Things {
    private boolean isExist;
    static private int count = 0;



    Things() {
        System.out.println("물질이 생성되었습니다.");
        count++;
        isExist = true;
    }
    public void state() {
        System.out.println("=========== 이 것의 상태 ============");
        System.out.println("이것은 물질입니다.");
    }
    public void count() {
        System.out.println("생성된 물질의 수 : " + count);
    }
}

