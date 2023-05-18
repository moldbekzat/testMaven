package  Final;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Objects;


public class RegistrationTest {
    WebDriver driver;
    Final.LoginPage loginPage;
    Final.StudentRegistrationPage studentRegistrationPage;
    Final.TextBoxPage textBoxPage;
    Final.BookStoreApplication bookStoreApplication;
    Final.WebTables webTables;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--force-device-scale-factor=0.8");
        driver = new ChromeDriver(options);
      //  driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();

    }
    @Test (priority = 1)
    public void testLoginPage() throws InterruptedException {
        loginPage = new Final.LoginPage(driver);
        Thread.sleep(2000);
        loginPage.enterUsername("Bekzat");
        loginPage.enterPassword("$Password07");
        loginPage.clickLoginButton();
        String link1 = "https://demoqa.com/login";
        if (Objects.equals(driver.getCurrentUrl(), link1)){
            System.out.println("login Page sucses");
        }else{
            System.out.println("login Page not sucses");
        }
        Thread.sleep(2000);
    }

    @Test (priority = 2)
    public void textBoxPage() throws InterruptedException {
        textBoxPage  = new Final.TextBoxPage(driver);
        Thread.sleep(3000);
        textBoxPage.clickElement1();
        textBoxPage.clickElement2();
        textBoxPage.textUserName("Bekzat Moldash");
        textBoxPage.textUserEmail("moldbekzat@gamil.com");
        textBoxPage.address1("Turkistan region, Tulkibas");
        textBoxPage.address2("Almmaty, AKkent");
        textBoxPage.clickLoginButton();
        textBoxPage.elementBack();
        Thread.sleep(2000);
        String link2 = "https://demoqa.com/text-box";
        if (Objects.equals(driver.getCurrentUrl(), link2)){
            System.out.println("TextBox Page successfully");
        }else{
            System.out.println("TextBox Page not sucses");
        }
    }
    @Test (priority = 3)
    public void webTables() throws InterruptedException {
        webTables = new Final.WebTables(driver);
        webTables.clickElement1();
        Thread.sleep(2000);
        webTables.clickWeb();
        webTables.clickAdd();
        webTables.setFirstName("FirstName");
        webTables.setLastName("LastName");
        webTables.setEmail("FirstLast@gamil.com");
        webTables.setAge("18");
        webTables.setSalary("1000000");
        webTables.setDepartment("Com");
        webTables.setSubmit();
        webTables.clickElement1();
        String link3 = "https://demoqa.com/webtables";
        if (Objects.equals(driver.getCurrentUrl(), link3)){
            System.out.println("Web tables Page successfully");
        }else{
            System.out.println("Web tables  Page not sucses");
        }
        Thread.sleep(4000);
    }

        @Test (priority = 4)
        public void testRegistration() throws InterruptedException {
            studentRegistrationPage  = new Final.StudentRegistrationPage(driver);
            studentRegistrationPage.inClassClick1();
            studentRegistrationPage.inClassClick2();
            studentRegistrationPage.enterFirstName("Bekzat");
            studentRegistrationPage.enterLastName("Moldash");
            studentRegistrationPage.enterEmail("johndoe@example.com");
            studentRegistrationPage.selectMaleGender();
            studentRegistrationPage.enterMobileNumber("87474210190");
            studentRegistrationPage.enterDateOfBirth("14 May 2023");
            studentRegistrationPage.openSubjectsDropdown();
            studentRegistrationPage.selectSubject("Maths");
            Thread.sleep(1000);
            studentRegistrationPage.selectSportsCheckbox();
            studentRegistrationPage.uploadPicture("D:\\AutoTest\\image\\mot.jpg");
            studentRegistrationPage.enterCurrentAddress("Almaty");
            studentRegistrationPage.selectState("NCR");
            studentRegistrationPage.selectCity("Delhi");
            studentRegistrationPage.clickSubmitButton();
            Thread.sleep(2000);
            studentRegistrationPage.close();
            studentRegistrationPage.inClassClick1();
            String link4 = "https://demoqa.com/automation-practice-form";
            if (Objects.equals(driver.getCurrentUrl(), link4)){
                System.out.println("Student Registration  Page successfully");
            }else{
                System.out.println("Student Registration  Page not sucses");
            }
            Thread.sleep(2000);

        }

        @Test (priority = 5)
        public void book() throws InterruptedException {
            try {
                bookStoreApplication = new BookStoreApplication(driver);
                Thread.sleep(2000);
                bookStoreApplication.goToMainPage();
                bookStoreApplication.goToBookStoreApplication();
                Thread.sleep(2000);
                bookStoreApplication.goToBookStore();
                bookStoreApplication.searchBook("Java");
                bookStoreApplication.search();
                bookStoreApplication.foundBook();
                bookStoreApplication.addToCollectionButton();
                System.out.println("Book Page is successfully");
            } catch (Exception e) {
                Alert alert = driver.switchTo().alert();
                alert.accept();
                System.out.println("Book Page is not successfully");
                Thread.sleep(4000);
            }
        }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
