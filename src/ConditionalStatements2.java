import java.util.Scanner;

public class ConditionalStatements2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number::");
        int num=s.nextInt();
        if(num>0){
            System.out.println("+ve");
        }else if(num<0){
            System.out.println("-ve");
        }else{
            System.out.println("0");
        }
    }
}
