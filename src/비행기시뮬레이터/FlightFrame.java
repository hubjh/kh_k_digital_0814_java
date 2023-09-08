package 비행기시뮬레이터;

public interface FlightFrame {
    final int FLY_MAX_SPEED = 1000;
    final int FLY_MIN_SPEED = 250;
    final int MAX_SPEED = 300;


    void speedUp();
    void speedDown();
    void takeOff();
    void landing();
}
