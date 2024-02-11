
import com.fall2023.ui.pages.TexBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.fall2023.ui.drivers.Driver;



public class TextBoxTest {
    WebDriver driver;
    TexBoxPage texBoxPage;

    @BeforeClass
    void setUpDriver() {
        driver = Driver.getDriver();
        texBoxPage = new TexBoxPage();
    }

    @Test
    void filUpTheFormPositiveTest() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        texBoxPage.fillUpFullName("Nurzat")
                .fillUpEmail("Nurzat@gmail.com")
                .fillUpCurrentAddress("Ton")
                .fillUpPermanentAddress("Bishkek")
                .submitBtn();



//
//        String expectedFullName = "Nurzat";
//        String expectedEmail = "Nurzat@gmail.com";
//        String expectedCurrentAddress = "Ton";
//        String expectedPermanentAddress = "Bishkek";

//        String actualFullName = driver.findElement(By.id("//p[@id='name']")).getText();
//        String actualEmail = driver.findElement(By.id("email")).getText();
//        String actualCurrentAddress = driver.findElement(By.id("currentAddress")).getText();
//        String actualPermanentAddress = driver.findElement(By.id("permanentAddress")).getText();
//        String actualSubmit = driver.findElement(By.id("submit")).getText();
//
//        Assert.assertEquals(expectedFullName, actualFullName);
//        Assert.assertEquals(expectedEmail, actualEmail);
//        Assert.assertEquals(expectedCurrentAddress, actualCurrentAddress);
//        Assert.assertEquals(expectedPermanentAddress, actualPermanentAddress);
//
//        Thread.sleep(6000);
    }
}






