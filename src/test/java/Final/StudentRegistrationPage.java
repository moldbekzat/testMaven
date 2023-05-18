package Final;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentRegistrationPage {
    WebDriver driver;

   @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div")
    WebElement inClass1;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li")
    WebElement inClass2;

    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(id = "userEmail")
    WebElement emailField;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]")
    WebElement maleRadioButton;

    @FindBy(id = "userNumber")
    WebElement mobileNumberField;

    @FindBy(id = "dateOfBirthInput")
    WebElement dateOfBirthField;


    @FindBy(xpath = "//*[@id=\"subjectsContainer\"]/div/div[1]")
    WebElement subjectsField;

    @FindBy(id = "subjectsInput")
    WebElement subjectsDropdown; // new element for the subject dropdown

    @FindBy(xpath = "//label[normalize-space()=\"Sports\"]")
    WebElement sportsCheckbox;

    @FindBy(id = "uploadPicture")
    WebElement pictureUploadField;

    @FindBy(id = "currentAddress")
    WebElement currentAddressField;

    @FindBy(id = "state")
    WebElement stateDropdown;

    @FindBy(id = "city")
    WebElement cityDropdown;

    @FindBy(id = "submit")
    WebElement submitButton;

    @FindBy(id = "closeLargeModal")
    WebElement closeButton;

    public StudentRegistrationPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void inClassClick1 () { inClass1.click(); }

    public void inClassClick2 () { inClass2.click(); }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void selectMaleGender() { maleRadioButton.click(); }

    public void enterMobileNumber(String mobileNumber) {
        mobileNumberField.sendKeys(mobileNumber);
    }

    public void enterDateOfBirth(String dateOfBirth) {
        dateOfBirthField.sendKeys(dateOfBirth);
    }

    public void openSubjectsDropdown() {
        subjectsField.click();
    }

    public void selectSubject(String subject) {
        subjectsDropdown.sendKeys(subject);
        subjectsDropdown.sendKeys(Keys.ENTER);
    }

    public void selectSportsCheckbox() {
        sportsCheckbox.click();
    }

    public void uploadPicture(String filePath) {
        pictureUploadField.sendKeys(filePath);
    }

    public void enterCurrentAddress(String currentAddress) {
        currentAddressField.sendKeys(currentAddress);
    }

    public void selectState(String state) {
        stateDropdown.click();
        WebElement option = driver.findElement(By.xpath("//div[@id='state']//div[contains(text(), '" + state + "')]"));
        option.click();
    }

    public void selectCity(String city) {
        cityDropdown.click();
        WebElement option = driver.findElement(By.xpath("//div[@id='city']//div[contains(text(), '" + city + "')]"));
        option.click();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void close() {
        closeButton.click();
    }

}

