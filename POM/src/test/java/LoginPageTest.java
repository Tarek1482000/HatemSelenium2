import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class LoginPageTest extends TestBase {

    @Test
    public static void ValidLoginTC() {
        loginPage.EnterEmail(email);
        loginPage.EnterPassword(password);
        loginPage.ClickingOnRememberMe();
        // Get the driver of home page
        homePage = loginPage.ClickingOnLogin();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertTrue(homePage.getSuccessLogin().getText().contains("Institute Management"),
                "Login was not successful");
    }

    @AfterTest
    public void CloseLogin()
    {
//        driver.quit();
    }
}
