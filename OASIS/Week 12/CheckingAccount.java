public class CheckingAccount extends Account {
    /**
     * Thu vu comment Javadoc.
     */
    public CheckingAccount(long accountNumber, double balance) {
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
