import org.example.Car;
import org.example.Motorcycle;
import org.example.Vehicle;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;



public class VehicleTest {

    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp(){
       car = new Car("Dodge", "Ram", 2010);
       motorcycle = new Motorcycle("Kavaski", "Ninja",2012);
    }


    @Test
    public void testCarIsInstanceOfVehicle() {

        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testMotorcycleIsInstanceOfVehicle(){

        assertInstanceOf(Vehicle.class, motorcycle);
    }

    @Test
    public void carCreat4Wheels(){

        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void motorcycleCreat4Wheels(){

        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public  void carSpeedTestDrive(){

        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void motorCycleSpeedTestDrive(){

        motorcycle.testDrive();

        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }


    @Test
    public void voidCarSpeedAndStop(){

        car.testDrive();
        car.park();

        assertThat(car.getSpeed()).isEqualTo(0);
        }


    @Test
    public void voidMotorcycleSpeedAndStop(){

        motorcycle.testDrive();
        motorcycle.park();

        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }


}





