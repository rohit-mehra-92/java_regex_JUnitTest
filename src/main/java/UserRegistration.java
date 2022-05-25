import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("1. First Name\n2. Last Name\n0. Exit");
            System.out.println("Enter choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the first name");
                    String firstName = sc.next();
                    userRegistration.testFirstName(firstName);
                case 2:
                    System.out.println("Enter the last name");
                    String lastName = sc.next();
                    userRegistration.testLastName(lastName);
                    break;
            }
        }
        while (choice != 0);
    }

    public boolean testFirstName(String firstName) {
        boolean isFirstName = Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
        if (isFirstName) {
            System.out.println("first name is valid");
            return true;
        } else {
            System.out.println("first name is invalid");
            return false;
        }
    }

    public boolean testLastName(String lastName) {
        boolean isLastName = Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
        if (isLastName) {
            System.out.println("Last name is valid");
            return true;
        } else {
            System.out.println("Last name is invalid");
            return false;
        }
    }
}