import java.util.Scanner;

public class ConditionalStatements7 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter first side value::");
        int a=s.nextInt();
        System.out.println("Enter second side value::");
        int b=s.nextInt();
        System.out.println("Enter third side value::");
        int c=s.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("Traingle exists");
        }else{
            System.out.println("Triangle doesn't exists");
        }
    }
}
