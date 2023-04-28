package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Locale;
import java.util.Random;

public class TestR {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    NewCustomerPage newCustomer;
    NewAccountPage account;
    DepositPage deposit;
    String customerId, DepositId ;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\Professional\\Downloads\\chromedriver_win32");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/v4/");
    }
    @Test
    public void testLogin() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("mngr481325");
        loginPage.setPassword("rYbubUb");
        loginPage.clickLogin();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/v4/manager/Managerhomepage.php");

    }

    protected String getEmailaddress() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    @Test(priority=1)
    public void testNewCustomer() throws InterruptedException {
        try {
            homePage = new HomePage(driver);
            homePage.clickNewCustomer();
            Thread.sleep(3000);
            WebElement frame1 = driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0"));
            driver.switchTo().frame(frame1);
            WebElement frame2 = driver.findElement(By.id("ad_iframe"));
            driver.switchTo().frame(frame2);
            driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
            driver.switchTo().defaultContent();
            //Thread.sleep(5000);
        }catch (Exception e) {
            System.out.println();
        }
        newCustomer = new NewCustomerPage(driver);
        newCustomer.setCustomerName("Moldash Bekzat");
        newCustomer.setGender("male");
        newCustomer.setBirthDate("07/09/2002");
        newCustomer.setAddress("Region 13");
        newCustomer.setCity("Almaty");
        newCustomer.setState("ALM");
        newCustomer.setPin("123456");
        newCustomer.setMoblileNumber("7474210190");
        newCustomer.setEmail(getEmailaddress().toLowerCase(Locale.ROOT)+"@gmail.com");
        newCustomer.setPassword("password");
        newCustomer.clickSubmit();

        Thread.sleep(2000);

        WebElement element = driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[4]/td[2]"));
        customerId = element.getText();

    }

    @Test(priority=2)
    public void testNewAccount() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickNewAccount();
        Thread.sleep(3000);
        account = new NewAccountPage(driver);
        account.setCustomerID(customerId);
        account.selectAccountType("Current");
        account.setInitialDeposit("1000");
        account.clickSubmit();
        Thread.sleep(2000);

        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"account\"]/tbody/tr[4]/td[2]"));
        DepositId = element1.getText();
    }

    @Test(priority=3)
    public void testDeposit() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickDeposit();
        Thread.sleep(2000);
        deposit = new DepositPage(driver);
        deposit.setAccountNo(DepositId);
        deposit.setAmount("500");
        deposit.setDescription("Deposit");
        deposit.clickSubmit();

    }
    @AfterTest
    public void quit()  {
        driver.quit();
    }
}
