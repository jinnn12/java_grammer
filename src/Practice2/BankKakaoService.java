package Practice2;

public class BankKakaoService implements BankService {
    @Override
    public void deposit (long money, BankAccount ba) {
        long current = ba.getBalance();
        long newBalance = current + money;

        ba.updateBalance(newBalance);
    }

    @Override
    public boolean withdraw(long money, BankAccount ba) {
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
