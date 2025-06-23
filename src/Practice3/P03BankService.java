package Practice3;

public interface P03BankService {
    void deposit(long money, P03BankAccount ba);

    boolean withdraw(long money, P03BankAccount ba);
}
