package Tesla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG {

  @Test
  public void Demo99 () {
    System.setProperty("www.webdriver.com", "C:\\Users\\Professional\\Downloads\\chromedriver_win32");

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.guru99.com/v4/");

    // STEP 2-3-4 // Enter valid username and password and click on Login button
    WebElement username = driver.findElement(By.name("uid"));
    username.sendKeys("mngr481322");
    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("saderEs");
    WebElement loginButton = driver.findElement(By.name("btnLogin"));
    loginButton.click();

  }
}