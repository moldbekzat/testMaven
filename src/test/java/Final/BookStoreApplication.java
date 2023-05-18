package Final;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStoreApplication {
    WebDriver driver;

    @FindBy (xpath = "//*[@id=\"app\"]/header/a")
    WebElement mainPage;

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div")
    WebElement bookStoreApplication;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[2]")
    WebElement bookStore;

    @FindBy(id = "searchBox")
    WebElement searchBox;

    @FindBy(id = "basic-addon2")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"see-book-Learning JavaScript Design Patterns\"]/a")
    WebElement foundBook;

    @FindBy(id = "addNewRecordButton")
    WebElement addToCollectionButton;


    public BookStoreApplication(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void goToMainPage() {
        mainPage.click();
    }

    public void goToBookStoreApplication() {
        bookStoreApplication.click();
    }

    public void goToBookStore() {
        bookStore.click();
    }

    public void searchBook(String bookName) {
        searchBox.click();
        searchBox.sendKeys(bookName);

    }
    public void search() {
        search.click();
    }

    public void foundBook() {
        foundBook.click();
    }

    public void addToCollectionButton() {
        addToCollectionButton.click();

    }

}
