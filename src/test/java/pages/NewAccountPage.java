package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
    WebDriver driver;

    @FindBy(name="cusid")
    WebElement customerId;

    @FindBy(name="selaccount")
    WebElement accountType;

    @FindBy(name="inideposit")
    WebElement deposit;

    @FindBy(name="button2")
    WebElement submit;

    public NewAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setCustomerID(String strCustomerID) {
        customerId.sendKeys(strCustomerID);
    }

    public void selectAccountType(String strAccountType) {
        accountType.sendKeys(strAccountType);
    }

    public void setInitialDeposit(String strInitialDeposit) {
        deposit.sendKeys(strInitialDeposit);
    }

    public void clickSubmit() {
        submit.click();
    }
}
