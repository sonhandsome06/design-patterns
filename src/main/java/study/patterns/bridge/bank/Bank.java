package study.patterns.bridge.bank;

public abstract class Bank {
    protected Account account;
    public Bank(Account account) {
        this.account = account;
    }
    public abstract void deposit(Double amount);
    public abstract void withdraw(Double amount);
    public abstract void transfer(String from, String to, Double amount);
    public abstract void openAccount(String name);
}
