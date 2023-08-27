package 자바연습하기;

public class Main {
    public static void main(String[] args) {
//        Things things = new Things();     // 물질 생성
//        things.state();
//        UnAnimals unAnimals = new UnAnimals();      // 무생물 생성
//        unAnimals.state();
//        Animals animals = new Animals();        // 생물 생성
//        animals.state();
        Fish salmon = new Fish();
        Fish eel = new Fish();
        Fish flatfish = new Fish();

        Mineral ruby = new Mineral();
        Mineral emerald = new Mineral();

//        things.count();
//        animals.count();
//        unAnimals.count();
        salmon.state();
        eel.state();
        flatfish.state();
        ruby.state();
        emerald.state();



    }
}
