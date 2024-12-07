package Looping;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number::");
        int n=s.nextInt();
        int rev=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Result::"+rev);
    }
}
