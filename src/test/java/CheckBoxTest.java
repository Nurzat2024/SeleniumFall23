import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.pages.CheckBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckBoxTest {
    WebDriver driver;
    CheckBoxPage checkBoxPage;

    @BeforeClass
    void setUpDriver() {
        driver = Driver.getDriver();
        checkBoxPage = new CheckBoxPage();

    }

    @Test
    void filUpTheFormPositiveTest() throws InterruptedException {
        driver.get("https://demoqa.com/checkbox");
        checkBoxPage
                .clickHome()
                .clickToDesktop()
                .clickToDocuments()
                .clickToDownloads();


        String actualHomeBtn2 =driver .findElement(By.xpath("//div[@id='result']")).getText();
        Assert.assertEquals(actualHomeBtn2, "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile");

        Thread.sleep(6000);

    }
}
