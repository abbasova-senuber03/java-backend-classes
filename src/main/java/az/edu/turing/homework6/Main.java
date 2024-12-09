package az.edu.turing.homework6;

public class Main {
           public static void main(String[] args) {
            BankAccount[] accounts = new BankAccount[5];

            accounts[0] = new SavingsAccount("Resed Esgerov", 1500.0, 108, 7.0);
            accounts[1] = new SavingsAccount("Revane Bayramova", 5000.0, 206, 5.5);

            accounts[2] = new CurrentAccount("Sebnem Memmedova", 3500.0, 201, 600.0);
            accounts[3] = new CurrentAccount("Isa Memmedov", 2000.0, 208, 1500.0);

            accounts[4] = new BankAccount("Samir Rzayev", 3000.0, 101);

            for (BankAccount account : accounts) {
                account.displayInfo();
                System.out.println(" ");
            }

            accounts[0].deposit(700);
            accounts[1].withdraw(500);
            accounts[2].withdraw(300);
            accounts[3].deposit(100);

            for (BankAccount account : accounts) {
                account.displayInfo();
                System.out.println(" ");
            }

            accounts[0].transfer(accounts[2], 300);


            ((SavingsAccount) accounts[0]).applyInterest();
            ((CurrentAccount) accounts[2]).withdraw(1700);

            System.out.println("Most recent accounts: ");
            for (BankAccount account : accounts) {
                account.displayInfo();
                System.out.println(" ");
            }
        }
    }

