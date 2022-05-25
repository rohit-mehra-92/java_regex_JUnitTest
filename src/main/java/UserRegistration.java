import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc = new Scanner(System.in);

    public void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        System.out.println("Enter the first name");
        String firstName = sc.next();
        userRegistration.testFirstName(firstName);
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
}

