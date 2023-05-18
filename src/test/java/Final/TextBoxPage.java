package Final;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div")
    WebElement element1;

    @FindBy(id = "item-0")
    WebElement element2;

    @FindBy(id = "userName")
    WebElement fullName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "currentAddress")
    WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddress;

    @FindBy(id = "submit")
    WebElement submit;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div")
    WebElement elementBack;

    public TextBoxPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickElement1 () {
        element1.click();
    }

    public void clickElement2 () {
        element2.click();
    }

    public void textUserName (String username) {
        fullName.sendKeys(username);
    }

    public void textUserEmail(String email) {
        userEmail.sendKeys(email);
    }

    public void address1(String address1) {
        currentAddress.sendKeys(address1);
    }

    public void address2(String address2) {
        permanentAddress.sendKeys(address2);
    }
    public void clickLoginButton() {
        submit.click();
    }
    public void elementBack () {
        elementBack.click();
    }
}