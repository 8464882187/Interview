package Looping;

import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a=s.nextLine();
        String rev=" ".toLowerCase();
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
        System.out.println(rev);
    }
}
