import java.util.Scanner;

public class ConditionalStatements5 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number a::");
        int a= s.nextInt();
        System.out.println("Enter number b::");
        int b=s.nextInt();
        System.out.println("Enter number c::");
        int c=s.nextInt();
        if(a>b ){
            System.out.println(a+"::100"+"A is greatest number");
        }else if(b>c){
            System.out.println(b+"::"+"B is greatest number");
        }else{
            System.out.println(c+"::"+"C is greatest number");
        }
    }
}
