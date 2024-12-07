import java.util.Scanner;

public class ConditionalStatements6 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter password::");
       String s1=s.nextLine();
        if(s1.length()>8){
            System.out.println("Strong ");
        }else if(s1.length()==8){
            System.out.println("Normal");
        }else{
            System.out.println("Weak");
        }
    }
}
