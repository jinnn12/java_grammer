package C04Interface.BankService;

public class BankServiceOriginal {
    public void deposit(long money, BankAccount ba) {
//        현재 얼마 있는지 조회
        Long current = ba.getBalance();
        Long newBalance = current + money;

//        그 금액과 money와 합산하여 updateBalance
        ba.updateBalance(newBalance);
    }

    public boolean withdraw(long money, BankAccount ba) {
//        현재 얼마 있는지 조회 & 잔액 체크 (출금 금액과 money와 비교)
        Long current = ba.getBalance();
        if (current < money) {
            return false;
        } else {
            long newBalance = current - money;
            ba.updateBalance(newBalance);
            return true;
        }

//        그 금액과 money와 차감하여 updateBalance



    }
}
