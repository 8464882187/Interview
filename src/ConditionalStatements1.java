import java.util.Scanner;

public class ConditionalStatements1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter marks::");
        int marks= s.nextInt();
        if(marks>90){
            System.out.println("First class");
        }else if(marks>70 ){
            System.out.println("Second class");
        }else if(marks>50 ){
            System.out.println("Third class");
        }else {
            System.out.println("Fourth class");
        }
    }
}
