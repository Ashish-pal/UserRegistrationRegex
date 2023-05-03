import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to User Registration Regex Problem");
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        boolean validFirstName = firstName.matches("^[A-Z][a-zA-Z]{2,}$");
        boolean validLastName = lastName.matches("^[A-Z][a-zA-Z]{2,}$");
        boolean validEmail = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

        if(validFirstName && validLastName && validEmail) {
            System.out.println("Valid input entered: " + firstName + " " + lastName + ", " + email);
        } else {
            if(!validFirstName) {
                System.out.println("Invalid first name. First name should start with a capital letter and have a minimum length of 3 characters.");
            }
            if(!validLastName) {
                System.out.println("Invalid last name. Last name should start with a capital letter and have a minimum length of 3 characters.");
            }
            if(!validEmail) {
                System.out.println("Invalid email. Email should have 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions.");
            }
        }
        sc.close();
    }
}