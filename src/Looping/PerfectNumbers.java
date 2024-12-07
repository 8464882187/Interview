package Looping;

import java.util.Scanner;

public class PerfectNumbers {
    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 0; i <= n / 2; i++) {
            if (n % i == 0)
                sum = sum + i;
            }
            return sum == n;
        }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number::");
        int a=s.nextInt();
        if(isPerfectNumber(a))
            System.out.println("perfect number");
        else
            System.out.println("not perfect");
    }
}
