package Vehicles;

import Behaviours.IRunMotor;

public class ElectricCar extends Vehicle implements IRunMotor {
    public ElectricCar(int price, String colour, int numberOfTyres) {
        super(price, colour, numberOfTyres);
    }


    public String outputMotorSound(String motorSound) {
        return start(motorSound);
    }

}
