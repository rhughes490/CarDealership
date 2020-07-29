import Vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    ElectricCar electricCar;

    @Before
    public void before() {
        electricCar = new ElectricCar(20000, "red", 4);
    }

    @Test
    public void hasPrice() {
        assertEquals(20000, electricCar.getPrice());
    }

    @Test
    public void hasColour() {
        assertEquals("red", electricCar.getColour());
    }

    @Test
    public void hasTyres() {
        assertEquals(4, electricCar.getNumberOfTyres());
    }
}
