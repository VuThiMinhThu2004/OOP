import java.lang.reflect.Array;
import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            Transaction newTransaction = new Transaction("deposit", amount, balance);
            transitionList.add(newTransaction);
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
            Transaction newTransaction = new Transaction("withdraw", amount, balance);
            transitionList.add(newTransaction);
        }
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void addTransaction(double amount, String operator) {
        if (!operator.equals(Transaction.DEPOSIT) && !operator.equals(Transaction.WITHDRAW)) {
            System.out.println("Yeu cau khong hop le!");
            return;
        }
        if (operator.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else {
            withdraw(amount);
        }
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            if (transitionList.get(i).getOperation().equals(Transaction.DEPOSIT)) {
                System.out.print("Giao dich " + (i + 1) + ": " + "Nap tien $");
                System.out.format("%.2f", transitionList.get(i).getAmount());
                System.out.print(". So du luc nay: $");
                System.out.format("%.2f", transitionList.get(i).getBalance());
                System.out.println(".");
            } else {
                System.out.print("Giao dich " + (i + 1) + ": " + "Rut tien $");
                System.out.format("%.2f", transitionList.get(i).getAmount());
                System.out.print(". So du luc nay: $");
                System.out.format("%.2f", transitionList.get(i).getBalance());
                System.out.println(".");
            }
        }
    }

    /**
     * An especially short bit of Javadoc.
     */
    public static void main(String[] args) {
        Account acc = new Account();
        acc.addTransaction(2000.255, "deposit");
        acc.addTransaction(1000, "withdraw");
        acc.printTransaction();
    }
}
