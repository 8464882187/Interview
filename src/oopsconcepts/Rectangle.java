package oopsconcepts;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle r= new Rectangle(20,50);
        System.out.println("Before modification length");
        System.out.println(r.getLength());
        System.out.println(r.getWidth());
        r.setLength(28);
        r.setWidth(10);
        System.out.println("After modification::");
        System.out.println(r.getLength()+" "+r.getWidth());
    }
}
