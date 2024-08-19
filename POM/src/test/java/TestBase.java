import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class TestBase {

    public static Properties prop;

    protected static WebDriver driver;
    protected static LoginPage loginPage;
    protected static CoursePage coursePage;

    protected static String browser;
    protected static String url;
    protected static String email;
    protected static String password;
    protected static String courseName;
    protected static String chromeBrowser;
    protected static String edgeBrowser;


    @BeforeTest
    public void setup() throws IOException {
        reloadData();
        selectBrowser(browser);

        driver.manage().window().maximize();
        driver.get(url);
        loginPage = new LoginPage(driver);
        coursePage = new CoursePage(driver);
    }

    public void reloadData() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/My data/config.properties");
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
    @AfterTest
    public void CloseBase()
    {
//        driver.quit();
    }
}
