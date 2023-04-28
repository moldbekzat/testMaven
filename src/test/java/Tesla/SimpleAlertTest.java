package Tesla;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SimpleAlertTest {
    WebDriver driver;
    @BeforeSuite
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void clickMe() {
        driver.findElement(By.id("alertButton")).click();
        driver.switchTo().alert();
    }

    @Test(priority = 1, expectedExceptions = {NoAlertPresentException.class})
    public void ok() {
        driver.switchTo().alert().accept();
        driver.switchTo().alert();
    }
}