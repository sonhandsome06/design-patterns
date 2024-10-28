package study.patterns.bridge.bank;

public class MbBank extends Bank {

    public MbBank(Account account) {
        super(account);
    }

    @Override
    public void deposit(Double amount) {

    }

    @Override
    public void withdraw(Double amount) {

    }

    @Override
    public void transfer(String from, String to, Double amount) {

    }

    @Override
    public void openAccount(String name) {
        this.account.open(name);
    }
}
