import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Text-based program for now
 * 
 * @version 04.06.2023
 * @author Tim Asher
 */
public class WorkoutTracker {

    private static Map<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean first = true;
        User user = null;

        while (true) {
            if (first) {
                System.out.println("Welcome to Tim's Workout Tracker App Prototype! What would you like to do?");
                first = false;
            }
            System.out.println("1. Create User");
            System.out.println("2. Select User");
            System.out.println("3. View Workout Routine");
            System.out.println("4. Add Workout Progress");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createUser(scanner);
                    break;
                case 2:
                    user = selectUser(scanner);
                    break;
                case 3:
                    userRoutine(user, scanner);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice or that choice has not been implemented yet.");
            }
        }
    }

    /**
     * 
     * @param scanner
     */
    private static void createUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.next();
        
        // Add way to check that username is unique
        while (users.containsKey(username)) {
            System.out.print("Username taken. Please enter another username: ");
            username = scanner.next();
        }

        User newUser = new User(username);
        users.put(username, newUser);

        System.out.println("User created successfully!");
    }

    /**
     * 
     * @param scanner
     * @return
     */
    private static User selectUser(Scanner scanner) {
        if (users.isEmpty()) {
            System.out.println("No users in system. Please create a user.");
            return null;
        }
        System.out.println("Current users in system:");
        for (String username : users.keySet()) {
            System.out.println(username);
        }
        System.out.print("Enter username to select: ");
        String username = scanner.next();

        while (!users.containsKey(username)) {
            System.out.println("User not found. Please select an existing user: ");
            username = scanner.next();
        }

        System.out.println("User selected: " + username);
        return users.get(username);
    }

    /**
     * 
     * @param user
     * @param scanner
     */
    private static void userRoutine(User user, Scanner scanner) {
        if (user != null) {
            System.out.println(user.toString());
        }
        else {
            System.out.println("No user selected.");
        }
    }
}
