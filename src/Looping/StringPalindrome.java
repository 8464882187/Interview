package Looping;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter name::");
        String a=s.nextLine().toLowerCase();
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }if(a.equals(rev)){
            System.out.println(a +" Palindrome");
        }else{
            System.out.println(a +" not palindrome");
        }
    }
}
