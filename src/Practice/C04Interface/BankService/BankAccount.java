package Practice.C04Interface.BankService;
// 계좌 개설 및 입금 / 출금

public class BankAccount {
//    필드
    private String accountNumber;
    private Long balance;

//    생성자
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0L;
    }

    //    메서드
//    최종 확정 금액을 통해 update : 아래 메서드를 입/출금에 모두 활용
    public void updateBalance(long money) {
        this.balance = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Long getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
