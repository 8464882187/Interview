package Inheritance;

import java.util.Scanner;

public class Rectangle extends Shape{
    public void getArea(int length,int width) {
        int area=length*width;
        System.out.println("Area of rectangle::"+area);
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter length of rectangle::");
        int length=s.nextInt();
        System.out.println("Enter width of rectangle::");
        int width=s.nextInt();
        Shape s1= new Rectangle();
        s1.getArea(length,width);
    }
}
