package Tesla;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tesla {
    public static void main(String[] args)  {
         System.setProperty("https://yandex.com/ ", "C:\\Users\\Professional\\Downloads\\chromedriver_win32");
         WebDriver driver  = new ChromeDriver();
         driver.get("https://yandex.com/");

         driver.manage().window().maximize();
         driver.findElement(By.name("S")).sendKeys();







        /* driver.findElement(By.id("item-0")).click();
         driver.findElement(By.id("userName")).sendKeys("Bekzat");
         driver.findElement(By.id("userEmail")).sendKeys("bekzatmoldash2019@gmail.com");
         driver.findElement(By.id("currentAddress")).sendKeys("Akkent");
         driver.findElement(By.id("permanentAddress")).sendKeys("Akkent");
         driver.findElement(By.id("submit")).click();
         String name = driver.findElement(By.id("name")).getText();
         String email = driver.findElement(By.id("email")).getText();
         String currentAddress = driver.findElement(By.cssSelector("#output #currentAddress")).getText();
         String permanentAddress = driver.findElement(By.cssSelector("#output #permanentAddress")).getText();
         System.out.println(name.split(":")[1]);
         System.out.println(email.split(":")[1]);
         System.out.println(currentAddress.split(":")[1]);
         System.out.println(permanentAddress.split(":")[1]);*/

       /*  driver.findElement(By.id("item-1")).click();
         driver.findElement(By.className("rct-collapse-btn")).click();


        List<WebElement> buttons = driver.findElements(By.className("rct-collapse-btn"));
        buttons.get(buttons.size() - 1).click();

        List<WebElement> checkboxes = driver.findElements(By.className("rct-checkbox"));
        checkboxes.get(checkboxes.size() - 1).click();

        System.out.println(driver.findElement(By.cssSelector("#result .text-success")).getText());
*/





    }
}
