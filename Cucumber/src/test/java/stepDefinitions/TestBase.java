package stepDefinitions;

import DefinitionsClasses.LoginPage;
import DefinitionsClasses.HomePage;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;


public class TestBase {

    public static Properties prop;

    protected static WebDriver driver;
    protected static LoginPage loginPage;
    protected static HomePage homePage;

    protected static String browser;
    protected static String url;
    protected static String email;
    protected static String password;
    protected static String courseName;
    protected static String chromeBrowser;
    protected static String edgeBrowser;


    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() throws IOException {
        reloadData();
        selectBrowser(browser);

        driver.manage().window().maximize();
        driver.get(url);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    public void reloadData() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\tarek\\Desktop\\Automation Task\\Cucumber\\src\\main\\My data\\config.properties");
        prop.load(fis);

        browser = prop.getProperty("SelectedBrowser");
        url = prop.getProperty("URL");
        courseName = prop.getProperty("CourseName");
        email = prop.getProperty("Email");
        password = prop.getProperty("Password");
        chromeBrowser = prop.getProperty("ChromeBrowser");
        edgeBrowser = prop.getProperty("EdgeBrowser");
    }

    public void selectBrowser(String browser) {
        if(Objects.equals(browser, edgeBrowser))
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (Objects.equals(browser, chromeBrowser)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else {
            throw new IllegalArgumentException("Browser not supported: " + browser);
        }
    }

}
