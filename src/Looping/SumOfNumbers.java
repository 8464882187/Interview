package Looping;

import java.util.Scanner;
//prime numbers
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number::");
        int a=s.nextInt();
        int sum=0;
        for (int i = 2; i <= a; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("Sum of prime numbers: " + sum);
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
            }
        }

