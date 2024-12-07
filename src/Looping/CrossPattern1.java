package Looping;

import java.util.Scanner;

public class CrossPattern1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(i==j || i+j==a-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
