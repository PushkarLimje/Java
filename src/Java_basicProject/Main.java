package Java_basicProject;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount("SA123", "Alice", 5000, 3.5);
        CheckingAccount ca = new CheckingAccount("CA456", "Alisha", 2000, 1000);

        System.out.println("--- Saving Account ---");
        sa.deposit(500);
        sa.withdraw(1000);
        sa.applyInterest();
        sa.displayAccountInfo();

        System.out.println("\n--- Checking Account ---");
        ca.withdraw(2500);  // Uses overdraft
        ca.deposit(300);
        ca.displayAccountInfo();
    }
}

class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}


class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot overdraw in a savings account.");
        }
    }
}


 class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Exceeds overdraft limit.");
        }
    }
}

