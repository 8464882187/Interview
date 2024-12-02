import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ConditionalStatements4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter year::");
        int year=s.nextInt();
        if(year%4==0 || year%100==0 && year%400==0){
            System.out.println(year+" "+" Is Leap Year");
        }else{
            System.out.println(year+" "+" Is Not a Leap Year");
        }
    }
}
