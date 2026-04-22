import java.util.LinkedList;
import java.util.List;
import java.util.Date;

public class User {

    private int accountNumber;
    private String name;
    private int pin;
    private double balance;
    private LinkedList<String> transactions;

    // Constructor
    public User(int accountNumber, String name, int pin) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.pin = pin;
        this.balance = 0.0;
        this.transactions = new LinkedList<>();
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // PIN validation
    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    // Change PIN
    public void changePin(int oldPin, int newPin) throws Exception {
        if (this.pin != oldPin) {
            throw new InvalidPinException("Incorrect old PIN!");
        }
        this.pin = newPin;
    }

    // Deposit
    public void deposit(double amount) throws Exception {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be positive!");
        }

        balance += amount;
        addTransaction("Deposit", amount);
    }

    // Withdraw
    public void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be positive!");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        addTransaction("Withdraw", amount);
    }

    // Add transaction
    private void addTransaction(String type, double amount) {
        String record = type + " - ₹" + amount + " - " + new Date();
        transactions.addFirst(record);

        if (transactions.size() > 5) {
            transactions.removeLast();
        }
    }

    // Get mini statement
    public List<String> getMiniStatement() {
        return transactions;
    }
}
