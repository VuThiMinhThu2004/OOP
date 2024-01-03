public class Transaction {
    /**
     * TYPE_DEPOSIT_CHECKING = "Nạp tiền vãng lai";
     * TYPE_WITHDRAW_CHECKING = "Rút tiền vãng lai";
     * TYPE_DEPOSIT_SAVINGS = "Nạp tiền tiết kiệm";
     * TYPE_WITHDRAW_SAVINGS = "Rút tiền tiết kiệm";
     * javadoc.
     */
    public static final int TYPE_DEPOSIT_CHECKING = 0;
    public static final int TYPE_WITHDRAW_CHECKING = 1;
    public static final int TYPE_DEPOSIT_SAVINGS = 2;
    public static final int TYPE_WITHDRAW_SAVINGS = 3;


    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    public Transaction() {}

    /**
     * Thu vu comment Javadoc.
     */
    public Transaction(int type, double amount,
                       double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * Thu vu comment Javadoc.
     */
    public String getTransactionTypeString(int type) {
        if (type == TYPE_DEPOSIT_CHECKING) {
            return "Nạp tiền vãng lai";
        }
        if (type == TYPE_WITHDRAW_CHECKING) {
            return "Rút tiền vãng lai";
        }
        if (type == TYPE_DEPOSIT_SAVINGS) {
            return "Nạp tiền tiết kiệm";
        }

         if (type == TYPE_WITHDRAW_SAVINGS) {
             return "Rút tiền tiết kiệm";
         }

        return "";
    }

    /**
     * Thu vu comment Javadoc.
     */
   
    public String getTransactionSummary() {
        return ("- Kiểu giao dịch: " + getTransactionTypeString(type)
                + ". Số dư ban đầu: $" + String.format("%.2f", initialBalance)
                + ". Số tiền: $" + String.format("%.2f", amount)
                + ". Số dư cuối: $" + String.format("%.2f", finalBalance) + ".");
    }

}
