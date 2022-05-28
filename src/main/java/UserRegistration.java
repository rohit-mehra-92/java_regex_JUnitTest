import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) throws UserDetailException {
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

    public boolean testFirstName(String firstName) throws UserDetailException {
        try {
            if (firstName.length() == 0) {
                throw new UserDetailException("Please enter valid first name", UserDetailException.ExceptionTypes.ENTERED_EMPTY);
            }
            boolean isFirstName = Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
            if (isFirstName) {
                return true;
            }
        } catch (NullPointerException e) {
            throw new UserDetailException("Please enter valid first name", UserDetailException.ExceptionTypes.ENTERED_NULL);
        }
        return false;
    }


    public boolean testLastName(String lastName) throws UserDetailException {
        try {
            if (lastName.length() == 0) {
                throw new UserDetailException("Please enter valid last name", UserDetailException.ExceptionTypes.ENTERED_EMPTY);
            }
            boolean isLastName = Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
            if (isLastName) {
                return true;
            }
        } catch (NullPointerException e) {
            throw new UserDetailException("Please enter valid last name", UserDetailException.ExceptionTypes.ENTERED_NULL);
        }
        System.out.println("Please check Last Name");
        return false;
    }

    public boolean testEmail(String email) throws UserDetailException {
        try {
            if (email.length() == 0) {
                throw new UserDetailException("please enter valid email ", UserDetailException.ExceptionTypes.ENTERED_EMPTY);
            }
            boolean isEmailId = Pattern.matches("^([a-z0-9]+([-$%&+.]?[0-9a-z]+))[@][a-z0-9]+[.][a-z]{3,}([.][a-z]{2,})?$", email);
            if (isEmailId) {
                return true;
            }
        } catch (NullPointerException e) {
            throw new UserDetailException("Please enter valid email", UserDetailException.ExceptionTypes.ENTERED_NULL);
        }
        System.out.println("Please check Last Name");
        return false;
    }

    public boolean testPhoneNumber(String phoneNumber) throws UserDetailException {
        try {
            if (phoneNumber.length() == 0) {
                throw new UserDetailException("Please enter valid phone number", UserDetailException.ExceptionTypes.ENTERED_EMPTY);
            }
            boolean isPhoneNumber = Pattern.matches("^([1-9]+[0-9]+)[\\s][0-9]{10}$", phoneNumber);
            if (isPhoneNumber) {
                return true;
            }
        } catch (NullPointerException e) {
            throw new UserDetailException("Please enter phone number", UserDetailException.ExceptionTypes.ENTERED_NULL);
        }
        System.out.println("Please check phone number");
        return false;
    }

    public boolean testPassword(String password) throws UserDetailException {
        try {
            if (password.length() == 0) {
                throw new UserDetailException("Please enter valid password", UserDetailException.ExceptionTypes.ENTERED_EMPTY);
            }
            boolean isPassword = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.+[0-9])(?=.*[%^<>?/:'}{()*!|.,;_#&$+=@]).{8,}$", password);
            if (isPassword) {
                return true;
            }
        } catch (
                NullPointerException e) {
            throw new UserDetailException("Please enter valid password", UserDetailException.ExceptionTypes.ENTERED_NULL);
        }
        System.out.println("Please check phone number");
        return false;
    }

}