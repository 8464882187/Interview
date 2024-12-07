package Inheritance;

public class BankAccount {
    double balance;
    long accountNumber;

    public BankAccount(long balance, long accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited amount::"+balance);
    }

    public void withDraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrwan amount::" + balance);
        }else{
            System.out.println("Insufficient balance");
        }

    }
}
