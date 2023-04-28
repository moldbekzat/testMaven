package Tesla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement input = driver.findElement(By.xpath("//input[@class=\"gLFyf\"]"));
        input.sendKeys("Arsenal FC");
        input.findElement(By.id("span")).click();
      //  driver.quit();
    }
}
