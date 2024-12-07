package Looping;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number::");
        int a=s.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=a-1;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
