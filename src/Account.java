public class Account {
    private double balance;

    public Account(double balance)
    {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void Deposit(double amount)
    {
        this.balance += amount;
    }

    public synchronized void Withdraw(double amount)
    {
        this.balance -= amount;
    }
}
