package Inheritance;

public class Truck extends Vehicle1{
    String make;
    String model;
    int year;
    String fuelType;

    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    public double calculateMaximumSpeed(int distance ,double time){
        return distance/time;
    }
}
