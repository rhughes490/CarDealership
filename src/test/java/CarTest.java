import Vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;

    @Before
    public void before() {
        car = new Car(20000, "red", 4);
    }

    @Test
    public void hasPrice() {
        assertEquals(20000, car.getPrice());
    }

    @Test
    public void hasColour() {
        assertEquals("red", car.getColour());
    }

    @Test
    public void hasTyres() {
        assertEquals(4, car.getNumberOfTyres());
    }
}
