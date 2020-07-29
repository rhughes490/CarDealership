package Vehicles;
import Behaviours.IRunEngine;
import Behaviours.IRunMotor;
import Engines.Engine;

public class Car extends Vehicle implements IRunEngine{

    private Engine engine;

    public Car(int price, String colour, int numberOfTyres, Engine engine){

        super(price, colour, numberOfTyres);
        this.engine = engine;
    }

    public String outputEngineSound(String data){return start(data);}

    public Engine getEngine() { return this.engine; }


}
