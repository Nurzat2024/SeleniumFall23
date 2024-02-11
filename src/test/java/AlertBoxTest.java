import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.helper.AlertHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertBoxTest {
    @Test
    void alertTestOk() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
        confirmButton.click();
        AlertHelper alertHelper = new AlertHelper();
        Thread.sleep(3000);
        alertHelper.acceptAlert();
//        //span[@id='confirmResult']
        String actualConfirmButton = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
        Assert.assertEquals(actualConfirmButton, "You selected Ok");
    }

    @Test
    void alertTestCancel() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
        confirmButton.click();
        AlertHelper alertHelper = new AlertHelper();
        Thread.sleep(6000);
        alertHelper.dismissAlert();
        String actualConfirmButton = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
        Assert.assertEquals(actualConfirmButton, "You selected Cancel");
    }


    @Test
    void promtButtonAlertTest() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement promtButton = driver.findElement(By.id("promtButton"));
        promtButton.click();
        AlertHelper alertHelper = new AlertHelper();
        alertHelper.sendKeysAlert("Nurzat");
        alertHelper.acceptAlert();
        Thread.sleep(6000);
        String actualpromtButtonMess = driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
        Assert.assertEquals(actualpromtButtonMess, "You entered Nurzat");
    }

    @Test
    void test1() {

        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();
        AlertHelper alertHelper = new AlertHelper();
        alertHelper.acceptAlert();

    }

    @Test
    void test2() throws InterruptedException {

        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
        timerAlertButton.click();
        AlertHelper alertHelper = new AlertHelper();
        alertHelper.acceptAlert();
        Thread.sleep(3000);


    }
}



