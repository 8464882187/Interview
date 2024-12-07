package Inheritance;

import java.util.Scanner;

public class Circle extends Shape{
    public void getPerimeter(int radius){
        System.out.println("Total perimeter::"+2*(3.14)*radius);
    }
    public  void getArea(int radius){
        System.out.println("Total Area::"+(3.14)*radius*radius);
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Area of circle::");
        int length=s.nextInt();
        System.out.println("Enter perimeter of the circle::");
        int perimeter=s.nextInt();
        Circle c= new Circle();
       c.getArea(20);
       c.getPerimeter(5);

    }
}
