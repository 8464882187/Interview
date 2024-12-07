import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int rem=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }if(temp==sum){
            System.out.println(temp+"::Armstrong number");
        }else{
            System.out.println(temp+"::Not Armstrong number");
        }

    }
}
