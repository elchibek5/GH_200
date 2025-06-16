package week_11;

import week_5.bank.Bank;

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

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }

        @Override
        public String toString() {
            return "BankAccount{" +
                    "accountNumber='" + accountNumber + '\'' +
                    ", balance=" + balance +
                    ", ownerName='" + ownerName + '\'' +
                    '}';
        }


        /// NEXT EXERCISE: Constructor Overloading and this keyword
//        static class BankAccountExtended extends BankAccount {
//            public BankAccountExtended() {
//            }
//        }
    }
}
