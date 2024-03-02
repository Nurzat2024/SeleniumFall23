import com.fall2023.ui.drivers.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FluentWaitDemoTest {
    @Test
    void test123(){
        WebDriver driver= Driver.getDriver();
        driver.get("https://demoqa.com/dynamic-properties");

        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))//каждые 2 секунды проверяет
                .pollingEvery(Duration.ofSeconds(2))//появился ли этот элемент или нет
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.alertIsPresent());

        WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));

    }

}
