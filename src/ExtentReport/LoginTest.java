package ExtentReport;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ExtentTestListener.class)
public class LoginTest {

    @Test
    public void validLoginTest() {

        System.out.println("Login test executed");
    }

    @Test
    public void failedTest() {

        throw new RuntimeException("Intentional failure");
    }
}