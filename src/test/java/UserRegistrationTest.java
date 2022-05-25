import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void givenFirstName_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testFirstName("Rohit");
        Assertions.assertTrue(result);
    }

    @Test
    void givenLastName_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testLastName("Mehra");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmailId_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testEmail("rohit264cool@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPhoneNumber_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testPhoneNumber("91 7415257009");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.testPassword("Rohit@81094");
        Assertions.assertTrue(result);
    }
}