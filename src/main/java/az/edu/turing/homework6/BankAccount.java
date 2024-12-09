package az.edu.turing.homework6;

public class BankAccount {
        String accountHolder;
        double balance;
        int accountNumber;

        public BankAccount(String accountHolder, double balance, int accountNumber) {
            this.accountHolder = accountHolder;
            this.balance = balance;
            this.accountNumber = accountNumber;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (balance - amount >= 0) {
                balance -= amount;
            } else {
                System.out.println("The balance is not enough.");
            }
        }

        public void displayInfo() {
            System.out.println(" " + accountHolder);
            System.out.println(" " + accountNumber);
            System.out.println(" " + balance);
        }

        public void transfer(BankAccount recipient, double amount) {
            if (balance - amount >= 0) {
                this.withdraw(amount);
                recipient.deposit(amount);
                System.out.println("The transfer was completed successfully.");
            } else {
                System.out.println("The balance is not enough.");
            }
        }
    }



