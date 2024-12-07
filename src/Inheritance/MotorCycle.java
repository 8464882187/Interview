package Inheritance;

public class MotorCycle extends Vehicle1{
    int engineSize;

    public MotorCycle(String make, String model, int year, String fuelType, int engineSize) {
        super(make, model, year, fuelType);
        this.engineSize = engineSize;
    }

    public int getEngineSize() {
        return engineSize;
    }
    public double calculateMaximumSpeed(int distance ,double time){
        return distance/time;
    }

    public static void main(String[] args) {
        Truck t = new Truck("Ford","F-150",2024,"Gasoline");
        Car1 c= new Car1("Tayota","Camry",2022,"Gasoline",4);
        MotorCycle m = new MotorCycle("Harley-Davidson","Electra Glide",2022,"Gasoline",107);
        System.out.println("Truck Information  *********************::");
        System.out.println("Make::" + t.getMake());
        System.out.println("Model::" + t.getModel());
        System.out.println("Year::" + t.getYear());
        System.out.println("Fuel Type::" +t.getFuelType());
        System.out.println("Maximum Speed::"+t.calculateMaximumSpeed(200,5.00));
        System.out.println("Car Information  **********************::");
        System.out.println("Make::" + c.getMake());
        System.out.println("Model::" + c.getModel());
        System.out.println("Year::" + c.getYear());
        System.out.println("Fuel Type::" +c.getFuelType());
        System.out.println("Maximum Speed::"+c.calculateMaximumSpeed(100,3.00));
        System.out.println("Motor Cycle Details  *****************::");
        System.out.println("Make::" + m.getMake());
        System.out.println("Model::" + m.getModel());
        System.out.println("Year::" + m.getYear());
        System.out.println("Fuel Type::" +m.getFuelType());
        System.out.println("Maximum Speed::"+m.calculateMaximumSpeed(50,2.5));

    }
}
