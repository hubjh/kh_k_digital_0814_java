package 다운캐스팅;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
Date : 2023-08-28
Author : J.H.Hwang
Purpose : 다운캐스팅을 설명하기 위한 프로그램입니다.
 */
// 상위 클래스형으로 변환 되었던 하위 클래스를 다시 원래 자료형으로 변환하는 것을 다운 캐스팅이라고 함.
public class DownCasting {
    ArrayList<Animal> aniList = new ArrayList<>();
    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
        downCasting.testCasting();
    }
    public void addAnimal() {
        aniList.add(new Animal());
        aniList.add(new Human());
        aniList.add(new Tiger());
        aniList.add(new Eagle());       // 리스트 안에 객체를 넣는 것 (객체 주소)
        for(Animal ani : aniList) {
            ani.move();
        }
    }
    public void testCasting() {
        for(int i = 0; i <aniList.size(); i++) {
            Animal ani = aniList.get(i);    // 업캐스팅
            if(ani instanceof Human) {  // Human형으로 다운캐스팅 가능 한지 확인
                Human h = (Human) ani;
                h.readBook();   // 원래 자신의 클래스에 대한 참조 변수 이기 때문에 접근 가능 함
            } else if(ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if(ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            } else {
                System.out.println("지원되지 않는 형입니다.");
            }
        }
    }
}
