package week_5.bank;

public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        Account creditAccount = new CreditAccount(0, 1000);
        creditAccount.withdraw(500);

        Account checkingAccount = new CheckingAccount(10000);
        myBank.addAccount(creditAccount);
        myBank.addAccount(checkingAccount);

        System.out.println(myBank.totalAmount());
    }
}
