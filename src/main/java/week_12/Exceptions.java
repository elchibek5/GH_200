package week_12;

public class Exceptions {
    public static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    static class BankAccountWithExceptions extends BankAccount {
        public BankAccountWithExceptions(String accountNumber, String ownerName, double balance) {
            super(accountNumber, ownerName, balance);
        }

        public void withdrawWithException(double amount) throws InsufficientFundsException{
            if (amount > getBalance()) {
                throw new InsufficientFundsException(
                        String.format("Insufficient funds. Requested: %.2f, Available: %.2f",
                                amount, getBalance())
                );
            }
            withdraw(amount);
        }
    }
}
