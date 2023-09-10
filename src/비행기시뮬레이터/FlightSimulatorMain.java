package 비행기시뮬레이터;

public class FlightSimulatorMain {
    public static void main(String[] args) throws InterruptedException {
        Flight flight = new Flight();
        flight.engine_on();
        flight.speedUp();
        flight.engine();
    }
}
