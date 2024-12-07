package Looping;

import java.util.Scanner;

public class AveragesWithEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        System.out.println("Enter number::");
        while (s.hasNextInt()) {
            int a = s.nextInt();
            if (a % 2 == 0) {
                sum = sum + a;
                count++;
            }
        }
            double d = (sum * 1.0) / count;
            System.out.println(d);
        }

}
