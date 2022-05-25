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
}
