public class InvalidPinException extends Exception {

    // Default constructor
    public InvalidPinException() {
        super("Invalid PIN!");
    }

    // Parameterized constructor
    public InvalidPinException(String message) {
        super(message);
    }
}