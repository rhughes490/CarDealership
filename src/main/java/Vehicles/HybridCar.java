package Vehicles;

import Behaviours.IRunEngine;
import Behaviours.IRunMotor;

public class HybridCar extends Vehicle implements IRunEngine, IRunMotor {
    public HybridCar(int price, String colour, int numberOfTyres){
        super(price, colour, numberOfTyres);
//    engine
//    electricMotor
}
    public String outputEngineSound(String data){return start(data);}
    public String outputMotorSound(String data){return start(data);}

}
