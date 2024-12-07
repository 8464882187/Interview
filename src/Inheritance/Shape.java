package Inheritance;

public class Shape {
    public void getArea(int length,int width){
        System.out.println("Area of given shape::");
    }
    public void getPerimeter(int radius){
        System.out.println(2*(3.14)*radius);
    }
    public  void getArea(int radius){
        System.out.println((3.14)*radius*radius);
    }
}
