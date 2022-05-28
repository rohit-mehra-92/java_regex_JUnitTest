import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public interface UserRegistrationFunction {
        boolean validate(String value, String pattern) throws UserDetailException;
    }

    UserRegistrationFunction testFirstName = (firstName, pattern) -> {
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
    };

    UserRegistrationFunction testLastName = (lastName, pattern) -> {
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
    };

    UserRegistrationFunction testEmail = (email, pattern) -> {
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
    };

    UserRegistrationFunction testPhoneNumber = (phoneNumber, pattern) -> {
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
    };

    UserRegistrationFunction testPassword = (password, pattern) -> {
        try {
            if (password.length() == 0) {
                throw new UserDetailException("Please enter valid password", UserDetailException.ExceptionTypes.ENTERED_EMPTY);
            }
            boolean isPassword = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.+[0-9])(?=.*[%^<>?/:'}{()*!|.,;_#&$+=@]).{8,}$", password);
            if (isPassword) {
                return true;
            }
        } catch (NullPointerException e) {
            throw new UserDetailException("Please enter valid password", UserDetailException.ExceptionTypes.ENTERED_NULL);
        }
        System.out.println("Please check phone number");
        return false;
    };
}
