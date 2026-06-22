class BankAccount {
    private String accountNumber;
    private String holder;
    private double balance;

    // Static variable to track total accounts
    private static int totalAccounts = 0;

    // Constructor
    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holder + " deposited ₹" + amount);
        }
    }

    // Withdraw method with overdraft check
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holder + " withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient balance for " + holder);
        }
    }

    // Account statement
    public void getStatement() {
        System.out.println("\nAccount Statement");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : ₹" + balance);
    }

    // Static method
    public static void displayTotalAccounts() {
        System.out.println("\nTotal Accounts Created: " + totalAccounts);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("A101", "Gautam", 10000);
        BankAccount acc2 = new BankAccount("A102", "Rahul", 15000);
        BankAccount acc3 = new BankAccount("A103", "Aman", 20000);

        // 5 transactions for Account 1
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(12000);

        // 5 transactions for Account 2
        acc2.deposit(1000);
        acc2.withdraw(2000);
        acc2.deposit(1500);
        acc2.withdraw(500);
        acc2.withdraw(10000);

        // 5 transactions for Account 3
        acc3.deposit(3000);
        acc3.withdraw(5000);
        acc3.deposit(2500);
        acc3.withdraw(1000);
        acc3.withdraw(25000);

        // Print statements
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        // Total accounts created
        BankAccount.displayTotalAccounts();
    }
}