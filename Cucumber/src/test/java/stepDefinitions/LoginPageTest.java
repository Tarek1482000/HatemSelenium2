package stepDefinitions;

import DefinitionsClasses.HomePage;
import DefinitionsClasses.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

import static org.testng.Assert.assertTrue;
import static stepDefinitions.TestBase.*;

public class LoginPageTest  {

    @Given("The user is on the login page")
    public static void the_user_is_on_the_login_page() throws IOException {
        TestBase.reloadData();
        selectBrowser(browser);

        driver.manage().window().maximize();
        driver.get(url);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @When("The user enters valid credentials")
    public static void the_user_enters_valid_credentials() {
        loginPage.EnterEmail(email);
        loginPage.EnterPassword(password);
        loginPage.ClickingOnRememberMe();
    }

    @When("Clicks on the Login button")
    public static void clicks_on_the_login_button() {
        homePage = loginPage.ClickingOnLogin();
    }


    @Then("The user should be logged in and redirected to the home page")
    public static void the_user_should_be_logged_in_and_redirected_to_the_home_page() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String expectedText = "Institute Management";
        String actualText = homePage.getSuccessLogin().getText();
        Assert.assertTrue(actualText.contains(expectedText), "Login was not successful");
    }

}
