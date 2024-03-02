import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.pages.NestedFramePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NestedFrameTest {
    WebDriver driver;
    NestedFramePage nestedFramesPage;

    @BeforeClass
    void setDriver() {
        driver = Driver.getDriver();
        nestedFramesPage = new NestedFramePage();
    }
    @Test
    void NestedFramesTest() throws InterruptedException {
        driver.get("https://demoqa.com/nestedframes");

        nestedFramesPage.parentHelper();
        String actualNestedParent = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
        Assert.assertEquals(actualNestedParent, "Parent frame");
        nestedFramesPage.switchToChildFrame();
        String actualNestedChild = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
        Assert.assertEquals(actualNestedChild, "Child Iframe");
    }

    @AfterTest
    void closeBtn()throws InterruptedException{
        Thread.sleep(1000);
        driver.quit();

    }


}