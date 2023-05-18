package Final;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTables {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div")
    WebElement element;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[4]")
    WebElement web1;

    @FindBy(xpath = "//*[@id=\"addNewRecordButton\"]")
    WebElement addButton;

    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "userEmail")
    WebElement email;

    @FindBy(id = "age")
    WebElement age;

    @FindBy(id = "salary")
    WebElement salary;

    @FindBy(id = "department")
    WebElement department;

    @FindBy(id = "submit")
    WebElement submit;


    public WebTables (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickElement1 () {
        element.click();
    }
    public void clickWeb () {
        web1.click();
    }
    public void clickAdd () {
        addButton.click();
    }
    public void setFirstName (String firstName) {
       this.firstName.sendKeys(firstName);
    }
    public void setLastName  (String lastName) {
         this.lastName.sendKeys(lastName);
    }
    public void setEmail (String email) {
        this.email.sendKeys(email);
    }
    public void setAge (String age) {
        this.age.sendKeys(age);
    }
    public void setSalary (String salary) {
        this.salary.sendKeys(salary);
    }
    public void setDepartment (String department) {
        this.department.sendKeys(department);
    }
    public void setSubmit  () {
        this.submit.click();
    }

}


