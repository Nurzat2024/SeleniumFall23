import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.helper.FrameHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FrameBoxTest {
    @Test
    void frameTest() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/frames");
        FrameHelper frameHelper = new FrameHelper(driver);
        WebElement frame1Id = driver.findElement(By.id("frame1"));
        frameHelper.switchToFrame(frame1Id);
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
    }

}
