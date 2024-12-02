import java.util.Scanner;

public class ConditionalStatements8 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter password::");
        char ch=s.next().charAt(0);
        if(Character.isLetter(ch)){
            System.out.println("It's a Character");
        }else if(Character.isDigit(ch)){
            System.out.println("It's a Digit");
        }else{
            System.out.println("It's a Special character");
        }
    }
}
