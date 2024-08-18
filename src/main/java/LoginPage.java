import dev.failsafe.internal.util.Assert;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver){
            super(driver);
    }

    By Email= By.id("Email");
    WebElement EmailElement ;

    By Password= By.id("inputPassword");
    WebElement PasswordElement ;

    By RememberMe = By.xpath("//*[@id=\"frmlogin\"]/div[4]/div[1]/label/i");
    WebElement RememberMeElement;

    By Login= By.id("btnLogin");
    WebElement LoginElement;


    public void EnterEmail(String Text){
        EmailElement = FindElementBylocator(Email);
        EmailElement.clear();
        SendText(EmailElement,Text);
    }

    public void EnterPassword(String Text){
        PasswordElement = FindElementBylocator(Password);
        PasswordElement.clear();
        SendText(PasswordElement,Text);
    }


    public void ClickingOnRememberMe(){
        RememberMeElement  = FindElementBylocator(RememberMe);
        Clicking(RememberMeElement);
    }

    public HomePage ClickingOnLogin(){
        LoginElement  = FindElementBylocator(Login);
        Clicking(LoginElement);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return new HomePage(driver);
    }
}
