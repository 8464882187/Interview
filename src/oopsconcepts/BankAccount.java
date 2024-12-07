package oopsconcepts;
import java.util.Scanner;
public class BankAccount {
    private long accountNumber;
    private int accountBalance;
    public BankAccount(long accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    public static void remainingBalance(int n,int m){
        int remaining = n - m;
        if (remaining >= 0) {
            System.out.println("Remaining balance: " + remaining);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter balance::");
        int n=s.nextInt();
        System.out.println("Enter amount::");
        int m=s.nextInt();
        remainingBalance(20000,3000);
        BankAccount ba= new BankAccount(1234567891,1000);
        ba.getAccountBalance();
        ba.getAccountNumber();
        System.out.println(ba);
    }
}
