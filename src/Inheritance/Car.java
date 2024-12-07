package Inheritance;

public class Car extends Vehicle{
    public void drive(){
        System.out.println("Repair a car::");
    }
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();
    }
}
