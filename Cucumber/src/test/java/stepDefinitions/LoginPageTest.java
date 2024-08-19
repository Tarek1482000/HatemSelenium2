package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class LoginPageTest extends TestBase {


    @When("The user enters valid credentials")
    public static void the_user_enters_valid_credentials() {
        loginPage.EnterEmail(email);
        loginPage.EnterPassword(password);
        loginPage.ClickingOnRememberMe();
    }

    @When("Clicks on the Login button")
    public void clicks_on_the_login_button() {
        homePage = loginPage.ClickingOnLogin();
    }


    @Then("The user should be logged in and redirected to the home page")
    public void the_user_should_be_logged_in_and_redirected_to_the_home_page() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String expectedText = "Institute Management";
        String actualText = homePage.getSuccessLogin().getText();
        Assert.assertTrue(actualText.contains(expectedText), "Login was not successful");
    }

}
