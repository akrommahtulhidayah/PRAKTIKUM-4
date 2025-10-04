package Vehicle.Car;

import Vehicle.Bike.Bike;

public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.start();
        tesla.drive();
        tesla.charge();

        Bike honda = new Bike();
        honda.start();
        honda.ride();
    }
}
