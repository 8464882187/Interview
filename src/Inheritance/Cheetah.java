package Inheritance;

public class Cheetah extends Animal{
    public void move(){
        System.out.println("cheetah is running");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.move();
        Cheetah c = new Cheetah();
        c.move();
    }
}
