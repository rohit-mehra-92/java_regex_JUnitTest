import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void givenFirstName_properFormat_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testFirstName("Rohit");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_improperFormat_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testFirstName("rohit");
        Assertions.assertFalse(result);
    }

    @Test
    void givenNull_WhenFirstNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testFirstName(null);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL, e.types);
        }
    }

    @Test
    void givenEmpty_WhenFirstNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testFirstName(" ");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY, e.types);
        }
    }

    @Test
    void givenLastName_properFormat_shouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testLastName("Mehra");
        Assertions.assertTrue(result);
    }

    @Test
    void givenLastName_improperFormat_shouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testLastName("mehra");
        Assertions.assertFalse(result);
    }

    @Test
    void givenNull_WhenLastNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testLastName(null);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL, e.types);
        }
    }

    @Test
    void givenEmpty_WhenLastNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testLastName(" ");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY, e.types);
        }
    }

    @Test
    void givenEmailId_properFormat_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testEmail("rohit264cool@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmailId_improperFormat_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testEmail("rohit264coolQgm.co");
        Assertions.assertFalse(result);
    }

    @Test
    void givenNull_WhenEmailException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testEmail(null);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL, e.types);
        }
    }

    @Test
    void givenEmpty_WhenEmailException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testEmail(" ");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY, e.types);
        }
    }

    @Test
    void givenPhoneNumber_properFormat_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testPhoneNumber("91 7415257009");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPhoneNumber_improperFormat_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testPhoneNumber("917415257009");
        Assertions.assertFalse(result);
    }

    @Test
    void givenNull_WhenPhoneNumberException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testPhoneNumber(null);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL, e.types);
        }
    }

    @Test
    void givenEmpty_WhenPhoneNumberException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testPhoneNumber(" ");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY, e.types);
        }
    }

    @Test
    void givenPassword_properFormat_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testPassword("Rohit@81094");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_improperFormat_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testPassword("rohit@81094");
        Assertions.assertFalse(result);
    }

    @Test
    void givenNull_WhenPasswordException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testPhoneNumber(null);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL, e.types);
        }
    }

    @Test
    void givenEmpty_WhenPasswordException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.testPhoneNumber(" ");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY, e.types);
        }
    }
}