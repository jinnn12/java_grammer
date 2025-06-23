package Practice2;

public class BankAccount {
    private String accountNumber;
    private long balance;

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0L;
    }

    public void updateBalance(long money) {
        this.balance = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public long getBalance() {
        return balance;
    }

}
