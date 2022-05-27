import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("1. First Name\n2. Last Name\n3. Email id\n4. Phone number\n5.Password \n0. Exit");
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
                case 3:
                    System.out.println("Enter the Email id");
                    String emailId = sc.next();
                    userRegistration.testEmail(emailId);
                    break;
                case 4:
                    System.out.println("Enter the Phone Number");
                    String phoneNum = sc.next();
                    userRegistration.testEmail(phoneNum);
                    break;
                case 5:
                    System.out.println("Enter the Password");
                    String password = sc.next();
                    userRegistration.testEmail(password);
                    break;
            }
        } while (choice != 0);
    }

    public String testFirstName(String firstName) {
        boolean isFirstName = Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
        if (isFirstName) {
            return "Happy";
        } else {
            return "Sad";
        }
    }

    public String testLastName(String lastName) {
        boolean isLastName = Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
        if (isLastName) {
            return "Happy";
        } else {
            return "Sad";
        }
    }

    public String testEmail(String email) {
        boolean isEmailId = Pattern.matches("^([a-z0-9]+([-$%&+.]?[0-9a-z]+))[@][a-z0-9]+[.][a-z]{3,}([.][a-z]{2,})?$", email);
        if (isEmailId) {
            return "Happy";
        } else {
            return "Sad";
        }
    }

    public String testPhoneNumber(String phoneNumber) {
        boolean isPhoneNumber = Pattern.matches("^([1-9]+[0-9]+)[\\s][0-9]{10}$", phoneNumber);
        if (isPhoneNumber) {
            return "Happy";
        } else {
            return "Sad";
        }
    }

    public String testPassword(String password) {
        boolean isPassword = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.+[0-9])(?=.*[%^<>?/:'}{()*!|.,;_#&$+=@]).{8,}$", password);
        if (isPassword) {
            return "Happy";
        } else {
            return "Sad";
        }
    }
}

