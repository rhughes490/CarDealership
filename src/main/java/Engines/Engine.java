package Engines;
public class Engine {

    int fueltank;
    double engineSize;

    public Engine(int fueltank, double engineSize){
        this.fueltank = fueltank;
        this.engineSize = engineSize;
    }

    public int getFuelTank(){
        return this.fueltank;
    }

}