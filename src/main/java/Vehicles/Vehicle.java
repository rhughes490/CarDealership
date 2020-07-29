package Vehicles;

public abstract class Vehicle {

   public int price;
   public String colour;
   public int numberOfTyres;

    public Vehicle(int price, String colour, int numberOfTyres) {
        this.price = price;
        this.colour = colour;
        this.numberOfTyres = numberOfTyres;
    }

    public int getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public int getNumberOfTyres() {
        return this.numberOfTyres;
    }

    //refactor data to be more explicit
    public String start(String data) {
        return "The car goes " + data;
    }


}
