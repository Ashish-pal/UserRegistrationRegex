import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to User Registration Regex Problem");
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        if (firstName.matches("^[A-Z][a-zA-Z]{2,}$")) {
            System.out.println("Valid first name: " + firstName);
        } else {
            System.out.println("Invalid first name. First name should start with a capital letter and have a minimum length of 3 characters.");
        }
        sc.close();
    }
}