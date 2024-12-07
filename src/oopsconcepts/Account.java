package oopsconcepts;

public class Account {
    private long accountNumber;
    private String accountHolder;
    private int balance;

    public Account(long accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(int amount){
       balance+= amount;
        System.out.println("Deposit::"+balance);
    }
    public void withdraw(int amount){
        balance=balance-amount;
        System.out.println("Remaining amount::"+amount);
    }

    public static void main(String[] args) {
        Account a = new Account(1234567890,"yamini",200000);
        System.out.println(a.getAccountNumber()+" "+a.getAccountHolder()+" "+a.getBalance());
       a.deposit(20000);
       a.withdraw(300);



    }
}
