package Looping;

import java.util.Scanner;
//factorial sum
public class SumOfPrimes {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number");
        int a=s.nextInt();
        int sum=0;
        int temp=a;
        while(temp!=0) {
            int res = temp % 10;
            int fact = 1;
            for (int i = 1; i <= res; i++){
                fact*=i;
            }
            sum+=fact;
            temp/=10;
        }
        System.out.println(sum);
    }
}
