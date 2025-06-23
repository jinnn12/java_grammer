package Practice2;

public interface BankService {
    public void deposit(long money, BankAccount ba);

    public boolean withdraw(long money, BankAccount ba);
}
