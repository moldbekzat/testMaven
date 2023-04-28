package Tesla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {
    private WebDriver driver;
    private By usernameField        = By.id("username");
    private By passwordField        = By.id("password");
    private By signInButton     	= By.id("log-in");
    private By rememberMeCheckbox   = By.id("rememberMe");
    private By twitterIcon          = By.id("twitterIcon");
    private By facebookIcon     	= By.id("fbIcon");
    private By linkedInIcon     	= By.id("linkedInIcon");
    private By errorMessage     	= By.id("alert");

    public LoginPage1(WebDriver driver) {
        this.driver = driver;

    }

    public void setUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

}
