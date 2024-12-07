package Inheritance;

public class Vehicle1 {
    String make;
    String model;
    int year;
    String fuelType;

    public Vehicle1(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }
    public  double CalculateFuelEfficiency(double distance,double fuelConsumed){
        return distance/fuelConsumed;
    }
    public double calculateDistanceTravelled(double speed,double time){
        return speed * time;
    }
    public double calculateMaximumSpeed(int distance ,double time){
        return distance/time;
    }
}
