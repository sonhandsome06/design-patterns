package study.patterns.bridge.bank;

public class DebitAccount implements Account{
    @Override
    public void deposit(double amount) {
        System.out.println("Deposit to " + amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + " from debit account");
    }

    @Override
    public void transferTo(String destinationAccount, double amount) {
        System.out.println("Transfer to " + destinationAccount);
    }

    @Override
    public void open(String accountName) {
        System.out.println("opened debit account " + accountName);
    }
}
