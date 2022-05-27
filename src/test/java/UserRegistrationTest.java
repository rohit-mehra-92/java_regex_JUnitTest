import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void givenFirstName_properFormat_ShouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String result = userRegistration.testFirstName("Rohit");
        Assertions.assertEquals("Happy", result);
    }

    @Test
    void givenFirstName_improperFormat_ShouldReturnSad() {
        UserRegistration userRegistration = new UserRegistration();
        String result = userRegistration.testFirstName("rohit");
        Assertions.assertEquals("Sad", result);
    }

    @Test
    void givenLastName_properFormat_shouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String result = userRegistration.testLastName("Mehra");
        Assertions.assertEquals("Happy", result);
    }

    @Test
    void givenLastName_improperFormat_shouldReturnSad() {
        UserRegistration userRegistration = new UserRegistration();
        String result = userRegistration.testLastName("mehra");
        Assertions.assertEquals("Sad", result);
    }

    @Test
    void givenEmailId_properFormat_ShouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String result = userRegistration.testEmail("rohit264cool@gmail.com");
        Assertions.assertEquals("Happy", result);
    }

    @Test
    void givenEmailId_improperFormat_ShouldReturnSad() {
        UserRegistration userRegistration = new UserRegistration();
        String result = userRegistration.testLastName("rohit264coolQgm.co");
        Assertions.assertEquals("Sad", result);
    }

    @Test
    void givenPhoneNumber_properFormat_ShouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String result = userRegistration.testPhoneNumber("91 7415257009");
        Assertions.assertEquals("Happy", result);
    }

    @Test
    void givenPhoneNumber_improperFormat_ShouldReturnSad() {
        UserRegistration userRegistration = new UserRegistration();
        String result = userRegistration.testPhoneNumber("917415257009");
        Assertions.assertEquals("Sad", result);
    }

    @Test
    void givenPassword_properFormat_ShouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String result = userRegistration.testPassword("Rohit@81094");
        Assertions.assertEquals("Happy", result);
    }

    @Test
    void givenPassword_improperFormat_ShouldReturnSad() {
        UserRegistration userRegistration = new UserRegistration();
        String result = userRegistration.testPassword("rohit@81094");
        Assertions.assertEquals("Sad", result);
    }
}