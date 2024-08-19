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

    public static WebDriver driver;
    public static LoginPage loginPage;
    public static HomePage homePage;

    public static String browser;
    public static String url;
    public static String email;
    public static String password;
    public static String courseName;
    public static String chromeBrowser;
    public static String edgeBrowser;


    public static void reloadData() throws IOException {
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

    public static void selectBrowser(String browser) {
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
