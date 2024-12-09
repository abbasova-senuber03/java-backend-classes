package az.edu.turing.homework6;

    class CurrentAccount extends BankAccount {
        double overdraftLimit;

        public CurrentAccount(String accountHolder, double balance, int accountNumber, double overdraftLimit) {
            super(accountHolder, balance, accountNumber);
            this.overdraftLimit = overdraftLimit;
        }
        @Override
        public void withdraw(double amount) {
            if (balance - amount >= overdraftLimit) {
                balance -= amount;
            } else {
                System.out.println("The payment limit is exceeded.");
            }
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("payment limit: " + overdraftLimit);
        }
    }


