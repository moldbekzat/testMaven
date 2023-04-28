package Tesla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabsTest {

    public static void main(String[] args) {

        // 1. Navigate to the URL https://www.saucedemo.com/.
        //System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\Professional\\Downloads\\chromedriver_win32");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        //2. Enter valid username "standard_user" in the username field.
        //3. Enter valid password "secret_sauce" in the password field.
        //4. Click on the Login button.
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // 5. Verify that the user is redirected to the Products page.
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("/inventory.html")) {
            System.out.println("User is redirected to the Products page.");
        } else {
            System.out.println("User is not redirected to the Products page.");
        }

        // 6. Select two or more products by clicking on the "Add to Cart" button.
        WebElement product1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        product1.click();
        WebElement product2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
        product2.click();

        // 7. Click on the shopping cart icon at the top of the page to view the cart.
        WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
        cartIcon.click();
       // WebElement productNames = driver.findElement(By.className("inventory_item_name"));
        WebElement cartItem1 = driver.findElement(By.xpath("//div[@class='cart_item'][1]"));
        WebElement cartItem2 = driver.findElement(By.xpath("//div[@class='cart_item'][2]"));

        // 8. Verify that the products are displayed in the cart.
        if (cartItem1.isDisplayed() && cartItem2.isDisplayed()) {
            System.out.println("Products added to the cart successfully");
        } else {
            System.out.println("Products not added to the cart");
        }

        // 9. Click on the "Checkout" button.
        // 10. Enter the required details in the Checkout Information form.
        // 11. Click on the "Continue" button.
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Bekzat");
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Moldash");
        WebElement zipCode = driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("12345");
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // 12. Verify that the Order Summary page is displayed.

        WebElement orderSummary = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        if (orderSummary.isDisplayed()) {
            System.out.println("Order Summary page is displayed.");
        }else {
            System.out.println("Order Summary page is not displayed.");
        }

       // 13. Click on the "Finish" button.
        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

       // 14. Verify that the Thank-you page is displayed.
       WebElement thankyou = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/img"));
       if  (thankyou.isDisplayed()){
           System.out.println("Thank you for your order!");
       }else {
           System.out.println("Something error ");
       }
        //driver.quit();
    }
}
