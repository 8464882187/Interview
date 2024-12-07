package Looping;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter uppercase letter::");
        char ch=s.next().toUpperCase().charAt(0);
        int n=ch-'A'+1;
        for(int i=0;i<n;i++){
           for(int j=0;j<n-i-1;j++){
               System.out.print(" ");
           }
           for(int k=0;k<2*i+1;k++){
               if(k==0 || k==2*i){
                   System.out.print((char)('A'+i));
               }else{
                   System.out.print(" ");
               }
           }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int k=0;k<2*i+1;k++){
                if(k==0 || k==2*i){
                    System.out.print((char)('A'+i));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
