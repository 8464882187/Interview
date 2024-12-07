package Looping;

import java.util.Scanner;

public class PrimeNumbers {
    public static int isPrime(int n) {
        if(n==1 || n==2 || n==3)
            return 1;

        if(n%2==0 || n%3==0)
            return 0;

        int i;
        int a = n / 2;
        for (i=5; i <= a; i=i+6)
            if(n%i==0 || n%(i+2)==0)
                return 0;
        return 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        PrimeNumbers obj = new PrimeNumbers();
        for (int i = a; i <= b; i++) {
            if (obj.isPrime(i) == 1)
                System.out.println(i);
        }
    }

}
