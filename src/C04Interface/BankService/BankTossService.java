package C04Interface.BankService;

public class BankTossService implements BankService {
    @Override
    public void deposit(long money, BankAccount ba) {
        Long current = ba.getBalance();
        Long newBalance = current + money;

        ba.updateBalance(newBalance);
    }

    @Override
    public boolean withdraw(long money, BankAccount ba) {
        return false;
    }
}
