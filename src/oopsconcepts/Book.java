package oopsconcepts;
import java.util.Scanner;
public class Book {
    private String title;
    private String AuthorName;
    private static double price;
    public Book(String title, String authorName, double price) {
        this.title = title;
        AuthorName = authorName;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthorName() {
        return AuthorName;
    }
    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public static void applyDiscount(double percentage) {
        if (percentage > 0) {
            double discount = (price * percentage) / 100;
            price-=discount;
        }else{
            System.out.println("There is no discount");
        }
    }
    public static void main(String[] args) {
        Book b= new Book("Java","James Gosling",200.00);
        System.out.println(b.getAuthorName());
        System.out.println(b.getPrice());
        System.out.println(b.getTitle());
        applyDiscount(30.00);
        System.out.println(price);
    }
}
