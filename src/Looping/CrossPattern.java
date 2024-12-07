package Looping;
import java.util.Scanner;
public class CrossPattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int g=0;
        System.out.println("Enter number::");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            //for(int k=0;k<i;k++)
            // j==n-i-1,j<=2*n
            //System.out.print(" ");
            if(n%2==1)
                g=(n/2)+1;
            else g=n/2;
            for(int j=0;j<=n;j++){

                if(i==j || j==n-i-1|| i==0 || i==g){
                    //if(i==0 && j<=g)
                       System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}