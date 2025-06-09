package week_11.exercises;

public class ClassEncapsulation {
    static class BankAccount {
        private final String accountNumber;
        private double balance;
        private String ownerName;

        public BankAccount(String accountNumber, String ownerName, double balance) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            this.balance = Math.max(0, balance);
        }

        public String getAccountNumber() { return accountNumber; }
        public double getBalance() { return balance; }
        public String getOwnerName() { return ownerName; }

        public void setOwnerName(String ownerName) { this.ownerName = ownerName; }


        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

//        public void withdraw()
    }
}
