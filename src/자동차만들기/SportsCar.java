package 자동차만들기;

public class SportsCar extends Car {
    String carName;
    boolean turbo = false;
    SportsCar(String carName) {
        this.mileage = 8;
        this.speed = 250;
        this.capacity = 30;
        this.numSeats = 2;
        this.carName = carName;
    }
    public void setTurbo() {
        if(!turbo) {
            speed = (int)(speed * 1.2);
            System.out.println(carName + "의 터보기능을 켭니다.");
            turbo = true;
        }
    }
}
