import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.helper.WindowHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowTest {

    @Test
    void testNewTab() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/browser-windows");
        WebElement newTab = driver.findElement(By.id("tabButton"));
        for (int i = 0; i < 5; i++) {
            newTab.click();
            Thread.sleep(1500);
        }
        WindowHelper windowHelper = new WindowHelper();
        windowHelper.switchToWindow(3);
        windowHelper.switchToParentWithChildClose();
        windowHelper.getWindowHandles();

        Thread.sleep(10000);
    }

    @Test
    void testNewWindow() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/browser-windows");
        WebElement newWindow = driver.findElement(By.xpath("//button[@id= 'windowButton']"));
        newWindow.click();
        Thread.sleep(2000);
        WindowHelper windowHelper = new WindowHelper();
        windowHelper.switchToParent();
    }

    @Test
    void testNewWindowMess() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/browser-windows");
        WebElement newWindowMess = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
        newWindowMess.click();
        Thread.sleep(2000);

        WindowHelper windowHelper = new WindowHelper();
        windowHelper.switchToWindow(1);
//        String actualTestNewWindowMess = driver.findElement(By.xpath("//body[contains(text(),'Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.')]")).getText();
//        Assert.assertEquals(actualTestNewWindowMess,"Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
        Thread.sleep(6000);


    }
}
