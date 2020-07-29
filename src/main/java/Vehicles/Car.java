package Vehicles;
import Behaviours.IRunEngine;


public class Car extends Vehicle implements IRunEngine{
    public Car(int price, String colour, int numberOfTyres){

        super(price, colour, numberOfTyres);
    }

    public String outputEngineSound(String data){return start(data);}


}
