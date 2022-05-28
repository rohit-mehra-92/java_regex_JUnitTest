import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void givenFirstName_properFormat_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testFirstName.validate("Rohit","^[A-Z][a-z]{2,}$");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_improperFormat_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testFirstName.validate("rohit","^[A-Z][a-z]{2,}$");
        Assertions.assertFalse(result);
    }

    @Test
    void givenNull_WhenFirstNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testFirstName.validate(null,"^[A-Z][a-z]{2,}$");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL, e.types);
        }
    }

    @Test
    void givenEmpty_WhenFirstNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testFirstName.validate(" ","^[A-Z][a-z]{2,}$");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY, e.types);
        }
    }

    @Test
    void givenLastName_properFormat_shouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testLastName.validate("Mehra","^[A-Z][a-z]{2,}$");
        Assertions.assertTrue(result);

    }

    @Test
    void givenLastName_improperFormat_shouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testLastName.validate("mehra","^[A-Z][a-z]{2,}$");
        Assertions.assertFalse(result);
    }

    @Test
    void givenNull_WhenLastNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testLastName.validate(null,"^[A-Z][a-z]{2,}$");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL, e.types);
        }
    }

    @Test
    void givenEmpty_WhenLastNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testLastName.validate(" ","^[A-Z][a-z]{2,}$");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY, e.types);
        }
    }

    @Test
    void givenEmailId_properFormat_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testEmail.validate("rohit264cool@gmail.com",
                "^([a-z0-9]+([-$%&+.]?[0-9a-z]+))[@][a-z0-9]+[.][a-z]{3,}([.][a-z]{2,})?$");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmailId_improperFormat_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testEmail.validate("rohit264coolQgm.co",
                "^([a-z0-9]+([-$%&+.]?[0-9a-z]+))[@][a-z0-9]+[.][a-z]{3,}([.][a-z]{2,})?$");
        Assertions.assertFalse(result);
    }

    @Test
    void givenNull_WhenEmailException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testEmail.validate(null,
                    "^([a-z0-9]+([-$%&+.]?[0-9a-z]+))[@][a-z0-9]+[.][a-z]{3,}([.][a-z]{2,})?$");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL, e.types);
        }
    }

    @Test
    void givenEmpty_WhenEmailException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testEmail.validate(" ",
                    "^([a-z0-9]+([-$%&+.]?[0-9a-z]+))[@][a-z0-9]+[.][a-z]{3,}([.][a-z]{2,})?$");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY, e.types);
        }
    }

    @Test
    void givenPhoneNumber_properFormat_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testPhoneNumber.validate("91 7415257009",
                "^([1-9]+[0-9]+)[\\s][0-9]{10}$");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPhoneNumber_improperFormat_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testPhoneNumber.validate("917415257009",
                "^([1-9]+[0-9]+)[\\s][0-9]{10}$");
        Assertions.assertFalse(result);
    }

    @Test
    void givenNull_WhenPhoneNumberException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testPhoneNumber.validate(null,
                    "^([1-9]+[0-9]+)[\\s][0-9]{10}$");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL, e.types);
        }
    }

    @Test
    void givenEmpty_WhenPhoneNumberException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testPhoneNumber.validate(" ",
                    "^([1-9]+[0-9]+)[\\s][0-9]{10}$");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY, e.types);
        }
    }

    @Test
    void givenPassword_properFormat_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testPassword.validate("Rohit@81094",
                "^(?=.*[a-z])(?=.*[A-Z])(?=.+[0-9])(?=.*[%^<>?/:'}{()*!|.,;_#&$+=@]).{8,}$");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_improperFormat_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testPassword.validate("rohit@81094",
                "^(?=.*[a-z])(?=.*[A-Z])(?=.+[0-9])(?=.*[%^<>?/:'}{()*!|.,;_#&$+=@]).{8,}$");
        Assertions.assertFalse(result);
    }

    @Test
    void givenNull_WhenPasswordException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testPassword.validate(null, "^(?=.*[a-z])(?=.*[A-Z])(?=.+[0-9])(?=.*[%^<>?/:'}{()*!|.,;_#&$+=@]).{8,}$");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL, e.types);
        }
    }

    @Test
    void givenEmpty_WhenPasswordException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testPassword.validate(" ","^(?=.*[a-z])(?=.*[A-Z])(?=.+[0-9])(?=.*[%^<>?/:'}{()*!|.,;_#&$+=@]).{8,}$");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY, e.types);
        }
    }
}