import java.util.HashMap;
import java.util.Random;

public class ATMService {

    private HashMap<Integer, User> users;
    private Random random;

    // Constructor
    public ATMService() {
        users = new HashMap<>();
        random = new Random();
    }

    // Generate unique 6-digit account number
    public int generateAccountNumber() {
        int accNo;
        do {
            accNo = 100000 + random.nextInt(900000);
        } while (users.containsKey(accNo)); // ensure uniqueness
        return accNo;
    }

    // Sign Up
    public User signup(String name, int pin) throws Exception {
        if (pin < 1000 || pin > 9999) {
            throw new InvalidAmountException("PIN must be 4 digits!");
        }

        int accNo = generateAccountNumber();
        User user = new User(accNo, name, pin);
        users.put(accNo, user);

        return user;
    }

    // Login
    public User login(int accNo, int pin) throws Exception {
        if (!users.containsKey(accNo)) {
            throw new InvalidPinException("Account not found!");
        }

        User user = users.get(accNo);

        if (!user.validatePin(pin)) {
            throw new InvalidPinException("Incorrect PIN!");
        }

        return user;
    }

    // Optional: Check if user exists
    public boolean userExists(int accNo) {
        return users.containsKey(accNo);
    }
}
