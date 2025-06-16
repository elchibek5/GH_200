package week_11;

public class Exceptions {
    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    static class BankAccountWithExceptions extends ClassEncapsulation.BankAccount {
        public BankAccountWithExceptions(String accountNumber, String ownerName, double balance) {
            super(accountNumber, ownerName, balance);
        }

        public void withdrawWithException(double amount) throws week_12.Exceptions.InsufficientFundsException {
            if (amount > getBalance()) {
                throw new week_12.Exceptions.InsufficientFundsException(
                        String.format("Insufficient funds. Requested: %.2f, Available: %.2f",
                                amount, getBalance())
                );
            }
            withdraw(amount);
        }
    }


}
