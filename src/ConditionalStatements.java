import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter age");
        int age=s.nextInt();
        if(age>=18){
            System.out.println("eligible for vote");
        }else{
            System.out.println("not eligible for vote ");
        }
    }
}
