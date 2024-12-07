package oopsconcepts;

import java.util.Scanner;

public class Circle {
    private int radius;
    Circle(int radius){
        this.radius=radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public static void calculateArea(int r){
        System.out.println((3.14)*(r*r));

    }
    public static void perimeter(int r1){
        System.out.println(2*(3.14)*r1);
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter area::");
        int r=s.nextInt();
        System.out.println("Enter perimeter::");
        int r1=s.nextInt();
        Circle c= new Circle(5);
        System.out.println(c.getRadius());
        calculateArea(r);
        perimeter(r1);
    }
}
