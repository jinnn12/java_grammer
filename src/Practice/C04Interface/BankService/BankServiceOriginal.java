package Practice.C04Interface.BankService;


public class BankServiceOriginal {
    public void deposit(long money, BankAccount ba) {
//        현재 얼마 있는지 조회
        long current = ba.getBalance();
        long newBalance = current + money;

//        그 금액과 money와 합산하여 updateBalance
        ba.updateBalance(newBalance);

    }

    public boolean withdraw(long money, BankAccount ba) {
//        현재 얼마 있는지 조회 && 잔액 체크 (money와 현재 balance 비교)
//        그 금액과 money와 차감하여 updateBalance
        long current = ba.getBalance();
        if (current >= money) {
            long newBalance = current - money;
            ba.updateBalance(newBalance);
            return true;
        } else {
            return false;
        }

    }


}
