import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.pages.BookStoreLoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BookStoreLoginTest {
    WebDriver driver;
    BookStoreLoginPage bookStoreLoginPage;
    @BeforeClass
    void setUpDriver() {
        driver = Driver.getDriver();
        bookStoreLoginPage = new BookStoreLoginPage();
    }
    @Test
    void filUpTheBookFormRegisterPositiveTest() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        bookStoreLoginPage
                .clickToNewUser()
                .fillUpFirstName("John")
                .fillUpLastName("Doe")
                .fillUpUserNameInput("JohnDoe")
                .fillUpPasswordInput("Qwerty@12345");
        Thread.sleep(10000);
        bookStoreLoginPage
                .clickOnCaptcha(driver)
                .clickToRegisterBtn()
                .clickToRegisterBtn();
   }
}
