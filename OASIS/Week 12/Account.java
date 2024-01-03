import  java.util.ArrayList;
import java.util.List;

public abstract class Account {
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";

    public Account(){}

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Thu vu comment Javadoc.
     */
    public void doWithdrawing(double amount)
        throws InvalidFundingAmountException, InsufficientFundsException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }

        if (balance - amount < 0) {
            throw new InsufficientFundsException(amount);
        }

        if (this instanceof SavingsAccount) {
            if (amount > 1000) {
                throw new InvalidFundingAmountException(amount);
            } else if (balance - amount < 5000) {
                throw new InsufficientFundsException(amount);
            } else {
                addTransaction(new Transaction(3,  amount, balance, balance - amount));
            }
        } else {
            addTransaction(new Transaction(1, amount, balance, balance - amount));
        }

        balance -= amount;
    }

    /**
     * Thu vu comment Javadoc.
     */
    public void doDepositing(double amount)
            throws InvalidFundingAmountException, InsufficientFundsException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }

        if (this instanceof CheckingAccount) {
            addTransaction(new Transaction(0, amount, balance, balance + amount));
        } else {
            addTransaction(new Transaction(2, amount, balance, balance + amount));
        }

        balance += amount;
    }

    public abstract void withdraw(double amount);
    
    public abstract void deposit(double amount);

    /**
     * Javadoc.
     */
    // public String getTransactionHistory() {
    //     String history = "Lịch sử giao dịch của tài khoản " + accountNumber + ":\n";

    //     for (Transaction it : transactionList) {
    //         history += it.getTransactionSummary() + "\n";
    //     }
    //     return history;
    // }

    public String getTransactionHistory() {
        StringBuilder history = new StringBuilder();
        history.append("Lịch sử giao dịch của tài khoản ").append(accountNumber).append(":\n");
    
        for (Transaction transaction : transactionList) {
            history.append(transaction.getTransactionSummary()).append("\n");
        }
        
        return history.toString();
    }

    
    /**
     * Javadoc.
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * Javadoc.
     */
    // public boolean equals(Object obj) {
    //     if (obj instanceof Account) {
    //         Account newx = (Account) obj;

    //         if (newx.equals(this)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Account account = (Account) obj;
        return accountNumber == account.accountNumber;
    }

    // Phương thức equals được định nghĩa lại để so sánh hai đối tượng Person
    public boolean equals(Object obj) {
        // Kiểm tra xem đối tượng truyền vào có phải là đối tượng Person hay không
        if (obj instanceof Person) {
            Person otherPerson = (Person) obj; // Ép kiểu đối tượng truyền vào thành Person

            // So sánh từng thuộc tính của hai đối tượng Person
            return this.name.equals(otherPerson.name) && this.age == otherPerson.age;
        }
        return false; // Trả về false nếu đối tượng truyền vào không phải là đối tượng Person
    }
}


