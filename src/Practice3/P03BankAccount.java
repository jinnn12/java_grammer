package Practice3;

public class P03BankAccount {
    private String bankAccount;
    private long balance;

//    balance는 입/출금 시점에 update 쳐야함.

    public P03BankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        this.balance = 0L; // 초기화는 필수
    }

    public void updateBalance(long money) {
        this.balance = money; // 입출금 실시간 update, 아마 ba를 공유해서 카카오뱅크, 토스뱅크 금액이 공유가 되는것 아닐까?
    }

    public String getBankAccount() {
        return bankAccount;
    }
    public long getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "P03BankAccount{" +
                "bankAccount='" + bankAccount +
                ", balance=" + balance +
                '}';
    }
}
