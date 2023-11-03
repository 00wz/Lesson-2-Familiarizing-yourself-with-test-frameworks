package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car=new Car("audi","123",5);
        motorcycle=new Motorcycle("yamaha","456", 3);
    }

    //- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
    // (используя оператор instanceof).
    @Test
    void correctCarExtends(){
        assertInstanceOf(Vehicle.class,car);
    }

    //- Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void correctCarWheelNumber(){
        assertEquals(4,car.getNumWheels());
    }

    //- Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void correctMotorcycleWheelNumber(){
        assertEquals(2,motorcycle.getNumWheels());
    }

    //- Проверить, что объект Car развивает скорость 60 в
    // режиме тестового вождения (используя метод testDrive()).
    @Test
    void correctCarSpeed(){
        car.testDrive();
        assertEquals(60,car.getSpeed());
    }

    //- Проверить, что объект Motorcycle развивает скорость 75 в
    // режиме тестового вождения (используя метод testDrive()).
    @Test
    void correctMotorcycleSpeed(){
        motorcycle.testDrive();
        assertEquals(75,motorcycle.getSpeed());
    }

    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е.
    // эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    void correctCarStop(){
        car.testDrive();
        car.park();
        assertEquals(0,car.getSpeed());
    }

    //- Проверить, что в режиме парковки (сначала testDrive, потом park,
    // т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    void correctMotorcycleStop(){
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0,motorcycle.getSpeed());
    }
}