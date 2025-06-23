package Practice3;

public class P03BankKakaoService implements P03BankService {
    @Override
    public void deposit(long money, P03BankAccount ba) {
        long current = ba.getBalance();
        long newBalance = current + money;

        ba.updateBalance(newBalance);
    }

    @Override
    public boolean withdraw(long money, P03BankAccount ba) {
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
