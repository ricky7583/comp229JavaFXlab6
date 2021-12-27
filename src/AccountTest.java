import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account(0);

        Transaction task1 = new Transaction("task1", myAccount);
        Transaction task2 = new Transaction("task2", myAccount);
        Transaction task3 = new Transaction("task3", myAccount);

        ArrayList<Transaction> transactionArrayList = new ArrayList<>();
        transactionArrayList.add(task1);
        transactionArrayList.add(task2);
        transactionArrayList.add(task3);

        System.out.println("Starting Executor");

        ExecutorService executorService = Executors.newCachedThreadPool();

        transactionArrayList.forEach(transaction -> {executorService.execute(transaction);});

        executorService.shutdown();
    }
}
