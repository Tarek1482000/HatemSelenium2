import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class LoginPageTest extends TestBase {

    @Test
    public void ValidLoginTC() {
        loginPage.EnterEmail("testregister@aaa.com");
        loginPage.EnterPassword("Wakram_123");
        loginPage.ClickingOnRememberMe();

        // Get the driver of home page
        homePage = loginPage.ClickingOnLogin();
        Assert.assertTrue(homePage.getSuccessLogin().getText().contains("Institute Management"),
                "Login was not successful");

    }

    @AfterTest
    public void close()
    {
//        driver.quit();
    }
}
