package Inheritance;

public class Car1 extends Vehicle1{
    int noOfDoors;

    public Car1(String make, String model, int year, String fuelType, int noOfDoors) {
        super(make, model, year, fuelType);
        this.noOfDoors = noOfDoors;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }
    public double calculateMaximumSpeed(int distance ,double time){
        return distance/time;
    }
}
