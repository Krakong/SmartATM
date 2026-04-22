import java.util.Scanner;

public class ATMApp {

    static Scanner sc = new Scanner(System.in);
    static ATMService service = new ATMService();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== SMART ATM =====");
            System.out.println("1. Sign Up");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> signup();
                case 2 -> login();
                case 3 -> {
                    System.out.println("Thank you for using ATM!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    // SIGNUP
    private static void signup() {
        try {
            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Set 4-digit PIN: ");
            int pin = sc.nextInt();

            User user = service.signup(name, pin);

            System.out.println("Account created successfully!");
            System.out.println("Your Account Number: " + user.getAccountNumber());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // LOGIN
    private static void login() {
        try {
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();

            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            User user = service.login(accNo, pin);

            System.out.println("Welcome, " + user.getName() + "!");
            userMenu(user);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // USER MENU AFTER LOGIN
    private static void userMenu(User user) {

        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            System.out.println("5. Mini Statement");
            System.out.println("6. Logout");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1 -> System.out.println("Balance: ₹" + user.getBalance());

                    case 2 -> {
                        System.out.print("Enter amount: ");
                        double amt = sc.nextDouble();
                        user.deposit(amt);
                        System.out.println("Deposit successful!");
                    }

                    case 3 -> {
                        System.out.print("Enter amount: ");
                        double amt = sc.nextDouble();
                        user.withdraw(amt);
                        System.out.println("Withdrawal successful!");
                    }

                    case 4 -> {
                        System.out.print("Enter old PIN: ");
                        int oldPin = sc.nextInt();
                        System.out.print("Enter new PIN: ");
                        int newPin = sc.nextInt();
                        user.changePin(oldPin, newPin);
                        System.out.println("PIN changed successfully!");
                    }

                    case 5 -> {
                        System.out.println("\nLast 5 Transactions:");
                        for (String t : user.getMiniStatement()) {
                            System.out.println(t);
                        }
                    }

                    case 6 -> {
                        System.out.println("Logged out successfully!");
                        return;
                    }

                    default -> System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}