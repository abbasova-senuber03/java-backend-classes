package az.edu.turing.homework6;
    class SavingsAccount extends BankAccount {
        double monthlyInterestRate;
        int withdrawalLimit;
        int withdrawalsMade = 0;

        public SavingsAccount(String accountHolder, double balance, int accountNumber, double monthlyInterestRate) {
            super(accountHolder, balance, accountNumber);
            this.monthlyInterestRate = monthlyInterestRate;
            this.withdrawalLimit = 3;
        }
        @Override
        public void withdraw(double amount) {
            if (withdrawalsMade < withdrawalLimit) {
                if (balance - amount >= 0) {
                    balance -= amount;
                    withdrawalsMade++;
                } else {
                    System.out.println("The balance is not enough.");
                }
            } else {
                System.out.println("The monthly withdrawal limit has been reached.");
            }
        }

        public void applyInterest() {
            balance += balance * (monthlyInterestRate / 100);
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println(" " + monthlyInterestRate + "%");
            System.out.println(" " + (withdrawalLimit - withdrawalsMade));
        }
    }


