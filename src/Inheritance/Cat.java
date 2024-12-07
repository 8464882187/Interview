package Inheritance;

public class Cat extends Animal{
    public void makeSound(){
        System.out.println("Bark::");
    }
    public static void main(String[] args) {
        Animal a = new Cat();
        a.makeSound();
    }
}
