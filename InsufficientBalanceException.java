public class InsufficientBalanceException extends Exception {

    // Default constructor
    public InsufficientBalanceException() {
        super("Insufficient balance!");
    }

    // Parameterized constructor
    public InsufficientBalanceException(String message) {
        super(message);
    }
}