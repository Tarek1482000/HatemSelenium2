import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {
    protected static WebDriver driver ;
    public PageBase(WebDriver driver)
    {
        this.driver = driver;
    }

    public static void SendText(WebElement element,String Text){
        element.sendKeys(Text);
    }

    public static void Clicking(WebElement element){
        element.click();
    }


    public static void highlightElement(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].style.border='2px solid fuchsia'", element);
    }

    public static WebElement FindElementBylocator(By locator ) {
        highlightElement(locator);
        return driver.findElement(locator);
    }

    public static String getContent(By locator) {
        return FindElementBylocator(locator).getText();
    }

}
