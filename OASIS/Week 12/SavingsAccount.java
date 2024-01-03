public class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Thu vu comment Javadoc.
     */
    @Override
    public void withdraw(double amount) {
        try {
            doWithdrawing(amount);
        } catch (InvalidFundingAmountException | InsufficientFundsException e) {
            e.printStackTrace();
        }
    }

    /**
     * Thu vu comment Javadoc.
     */
    @Override
    public void deposit(double amount) {
        try {
            doDepositing(amount);
        } catch (InsufficientFundsException | InvalidFundingAmountException e) {
            e.printStackTrace();
        }
    }
}
