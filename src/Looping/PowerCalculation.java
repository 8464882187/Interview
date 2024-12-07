package Looping;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number::");
        int a = s.nextInt();
        int x=s.nextInt();
        int res=1;
        for(int i=1;i<=x;i++){
            res=res*a;
        }
        System.out.println(res);
    }
}
