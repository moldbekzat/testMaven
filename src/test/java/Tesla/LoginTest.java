package Tesla;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://oldmy.sdu.edu.kz/index.php?mod=schedule");
    }

    @Test
    public void testLogin() throws InterruptedException {
         Thread.sleep(2000);

        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("200103361");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("password07");

        WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div[5]/div/form/input[2]"));
        submitBtn.click();

        Thread.sleep(2000);
    }
    @AfterTest
    public void tearDown()  {
        driver.quit();
    }
}
