package 자동차만들기;

public class PassengerCar extends Car {
    String carName;
    boolean trunk = false;
    PassengerCar(String carName) {
        this.mileage = 12;
        this.speed = 200;
        this.capacity = 45;
        this.numSeats = 4;
        this.carName = carName;
    }
    public void setTrunk() {
        if(!trunk) {
            numSeats = (int)(numSeats + 1);
            System.out.println(carName + "의 트렁크가 좌석으로 변경됩니다.");
            trunk = true;
        }
    }
}
