import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;

    @BeforeTest
    public void setup(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://swinji.azurewebsites.net/account/login");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void DoTestBase(){

    }

    @AfterTest
    public void close()
    {
//        driver.quit();
    }
}
