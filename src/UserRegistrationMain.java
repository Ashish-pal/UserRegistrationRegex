import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to User Registration Regex Problem");
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        boolean validFirstName = firstName.matches("^[A-Z][a-zA-Z]{2,}$");
        boolean validLastName = lastName.matches("^[A-Z][a-zA-Z]{2,}$");

        if(validFirstName && validLastName) {
            System.out.println("Valid first and last names: " + firstName + " " + lastName);
        } else {
            if(!validFirstName) {
                System.out.println("Invalid first name. First name should start with a capital letter and have a minimum length of 3 characters.");
            }
            if(!validLastName) {
                System.out.println("Invalid last name. Last name should start with a capital letter and have a minimum length of 3 characters.");
            }
        }
        sc.close();
    }
}