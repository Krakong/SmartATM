public class InvalidAmountException extends Exception {

    // Default constructor
    public InvalidAmountException() {
        super("Invalid amount entered!");
    }

    // Parameterized constructor
    public InvalidAmountException(String message) {
        super(message);
    }
}