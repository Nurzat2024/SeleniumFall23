import com.fall2023.BaseTest;
import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.helper.BrowserManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonTest extends BaseTest {
    @Test
    void test45() throws InterruptedException {
        driver = Driver.getDriver();

        BrowserManager browserManager = new BrowserManager(Driver.getDriver());
        browserManager.openByNavigate("https://www.amazon.com/");
        Thread.sleep(5000);
        browserManager.refreshThePage();
        Thread.sleep(5000);

        WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        element.sendKeys("iphone", Keys.ENTER);

        List<WebElement> brandsList = driver.findElements(By.xpath("//li[starts-with(@id,'p_89')]/span/a/div/label/i"));
        // ищем повторно:
        boolean retry = true;
        // кол-во попыток:
        int attempts = 0;

        while (retry && attempts < 3) {
            try {
                for (WebElement brand : brandsList) {
                    brand.click(); // Stale Element Reference Exception -> ссылка устарела, т.к. после клика html код обновился
//                    browserManager.refreshThePage();
                }

                retry = false; // если всё прокликалось всё без StaleElementReferenceException, то через retry false выходим из цикла
            } catch (StaleElementReferenceException e) {
                attempts++; // увеличиваем кол-во попыток
            }
        }
    }
}