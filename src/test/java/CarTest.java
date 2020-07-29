import Behaviours.IRunEngine;
import Vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;
    Engine engine;

    @Before
    public void before() {
        engine = new Engine(40, 1.40);
        car = new Car(20000, "red", 4, engine);
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

    @Test
    public void canStart(){ assertEquals("The car goes vroom", car.outputEngineSound("vroom"));}

//    @Test
//    public void hasEngineFuelTank() {assertEquals(40, car.getEngine().getFuelTank());}

    @Test
    public void hasEngine(){assertEquals(engine, car.getEngine());}
}
