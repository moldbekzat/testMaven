package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NewCustomerPage {
    WebDriver driver;

    @FindBy(name = "name")
    WebElement name;

    @FindBy(name = "rad1")
    WebElement gender;

    @FindBy(id = "dob")
    WebElement birthDate;

    @FindBy(name = "addr")
    WebElement address;

    @FindBy(name = "city")
    WebElement city;

    @FindBy(name = "state")
    WebElement state;

    @FindBy(name = "pinno")
    WebElement pin;

    @FindBy(name = "telephoneno")
    WebElement phoneNumber;

    @FindBy(name = "emailid")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "sub")
    WebElement submit;

    public NewCustomerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setCustomerName(String name)       {this.name.sendKeys(name);}
    public void setGender(String gender)           {this.gender.sendKeys(gender);}
    public void setBirthDate(String birthDate)     {this.birthDate.sendKeys(birthDate);}
    public void setAddress(String address)         {this.address.sendKeys(address);}
    public void setCity(String city)               {this.city.sendKeys(city);}
    public void setState(String state)             {this.state.sendKeys(state);}
    public void setPin(String pin)                 {this.pin.sendKeys(pin);}
    public void setMoblileNumber(String telephone) {this.phoneNumber.sendKeys(telephone);}
    public void setEmail(String email)             {this.email.sendKeys(email);}
    public void setPassword(String password)       {this.password.sendKeys(password);}
    public void clickSubmit()                      {submit.click();}
}

