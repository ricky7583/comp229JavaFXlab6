public class Transaction implements Runnable{
    private Account myAccount;
    private String name;

    public Transaction(String name, Account myAccount)
    {
        this.myAccount = myAccount;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            myAccount.Deposit(1000);
            myAccount.Withdraw(500);
            String output = String.format("Transaction named: %s is complete. Your balance is: %g", this.name, this.myAccount.getBalance());
            System.out.println(output);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
