package study.patterns.bridge.bank;

public class Main {
    public static void main(String[] args) {
        var debitAccount = new DebitAccount();
        var mbBank = new MbBank(debitAccount);
        mbBank.openAccount("sonhandsome");
    }
}
