package Looping;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int result=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print(++result+" ");
            }
            System.out.println();
        }

    }
}
