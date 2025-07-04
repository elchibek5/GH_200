package week_12;

public class Exceptions {

    public static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    static class BankAccount {
        private String accountNumber;
        private String ownerName;
        private double balance;

        public BankAccount(String accountNumber, String ownerName, double balance) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }
    }

    static class BankAccountWithExceptions extends BankAccount {
        public BankAccountWithExceptions(String accountNumber, String ownerName, double balance) {
            super(accountNumber, ownerName, balance);
        }

        public void withdrawWithException(double amount) throws InsufficientFundsException {
            if (amount > getBalance()) {
                throw new InsufficientFundsException(
                        String.format("Insufficient funds. Requested: %.2f, Available: %.2f",
                                amount, getBalance())
                );
            }
            withdraw(amount);
        }

        public void transferTo(BankAccountWithExceptions targetAccount, double amount) throws InsufficientFundsException {
            if (amount <= 0) {
                throw new IllegalArgumentException("Transfer amount must be positive.");
            }
            this.withdrawWithException(amount);
            targetAccount.deposit(amount);
        }
    }
}