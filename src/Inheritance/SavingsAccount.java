package Inheritance;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(long balance, long accountNumber) {
        super(balance, accountNumber);

    }
    public void withDraw(double amount){
        if(getBalance()>=100){
            super.withDraw(amount);
        }else{
            System.out.println("Insufficient-balance");
        }
    }
    public static void main(String args[]){
        BankAccount b = new BankAccount(30000,1234565432);
        b.deposit(2000.00);
        b.withDraw(1000.00);
        SavingsAccount s= new SavingsAccount(50000,123456543216l);
        s.deposit(4000.0);
        s.withDraw(2000.0);
    }
}
