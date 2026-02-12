import java.util.Scanner;

// Base class
class Account {
    String accountHolderName;
    int accountNumber;
    double balance;

    void getAccountDetails(Scanner sc) {
        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
        sc.nextLine(); // clear buffer
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void display() {
        System.out.println("\nAccount Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Derived class SavingsAccount
class SavingsAccount extends Account {
    double interestRate;

    void getSavingsDetails(Scanner sc) {
        getAccountDetails(sc);
        System.out.print("Enter Interest Rate (%): ");
        interestRate = sc.nextDouble();
        sc.nextLine();
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Calculated Interest: " + interest);
    }

    // Overriding display method
    void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Derived class CurrentAccount
class CurrentAccount extends Account {
    double overdraftLimit;

    void getCurrentDetails(Scanner sc) {
        getAccountDetails(sc);
        System.out.print("Enter Overdraft Limit: ");
        overdraftLimit = sc.nextDouble();
        sc.nextLine();
    }

    // Overriding withdraw method
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
    }

    // Overriding display method
    void display() {
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

// Main class
public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Savings Account
        System.out.println("Enter Savings Account Details:");
        SavingsAccount sa = new SavingsAccount();
        sa.getSavingsDetails(sc);

        System.out.print("Enter deposit amount for Savings: ");
        sa.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal amount for Savings: ");
        sa.withdraw(sc.nextDouble());

        sa.calculateInterest();
        sa.display();
        System.out.println("\nEnter Current Account Details:");
        CurrentAccount ca = new CurrentAccount();
        ca.getCurrentDetails(sc);

        System.out.print("Enter deposit amount for Current: ");
        ca.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal amount for Current: ");
        ca.withdraw(sc.nextDouble());

        ca.display();

        sc.close();
    }
}
