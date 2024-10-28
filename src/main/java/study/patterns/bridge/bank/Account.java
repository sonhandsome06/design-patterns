package study.patterns.bridge.bank;

public interface Account {

    void deposit(double amount);

    void withdraw(double amount);

    void transferTo(String destinationAccount, double amount);

    void open(String accountName);
}
