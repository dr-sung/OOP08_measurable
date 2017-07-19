
public class BankAccount implements Measurable {
    
    private double balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }

    @Override
    public double getMeasure() {
        return balance;
    }
    
}
