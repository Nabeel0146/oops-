import java.util.Scanner;

class auth extends Exception {
    public auth(String message) {
        super(message);
    }
}

class authentication {
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "admin123";

    public static void authenticate(String username, String password) throws auth {
        if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
            System.out.println("Login successful! Welcome, " + username + ".");
        } else {
            throw new auth("Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        String username = sc.next();

        System.out.print("Password: ");
        String password = sc.next();

        try {
            authenticate(username, password);
        } catch (auth e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Goodbye!");
        }
    }
}
