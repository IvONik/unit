package HW2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VehicleTest {

    @Test
    public void instansVehicle(){
        Car car = new Car("Toyota", "rav4", 2020);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void checkNumWheelCar() {
        Car car = new Car("Toyota", "rav4", 2020);
        assertTrue(car.getNumWheels() == 4);
    }

    @Test
    public void checkNumWheelMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("BMV", "spy", 2022);
        assertTrue(motorcycle.getNumWheels() == 2);
    }
    @Test

    public void speedTestDriveCar(){
        Car car = new Car("Toyota", "rav4", 2020);
        car.testDrive();
        assertTrue(car.getSpeed() == 60);
    }
    @Test
    public void speedTestDriveMotorcycle(){
        Motorcycle motorcycle = new Motorcycle("BMV", "spy", 2022);
        motorcycle.testDrive();
        assertTrue(motorcycle.getSpeed() == 75);
    }
    //проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    public void checkStopedCar(){
        Car car = new Car("Toyota", "rav4", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
    @Test
    public void checkStopedMotorcycle(){
        Motorcycle motorcycle = new Motorcycle("BMV", "spy", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}