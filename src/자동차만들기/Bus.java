package 자동차만들기;

public class Bus extends Car{
    String carName;
    boolean subFuel = false;
    Bus(String carName) {
        this.mileage = 5;
        this.speed = 150;
        this.capacity = 100;
        this.numSeats = 20;
        this.carName = carName;
    }
    public void setSubFuel() {
        if(!subFuel) {
            capacity = (int)(capacity + 30);
            System.out.println(carName + "의 보조연료탱크기능을 켭니다.");
            subFuel = true;
        }
    }
}
