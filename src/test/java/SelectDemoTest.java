import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.helper.DropDownHelper;
import com.fall2023.ui.helper.WebElementHelper;
import com.fall2023.ui.pages.SelectMenuPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDemoTest {
    @Test
    void demo1() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/select-menu");

        SelectMenuPage selectMenuPage = new SelectMenuPage();
        DropDownHelper dropDownHelper = new DropDownHelper();
        WebElementHelper webElementHelper = new WebElementHelper();

        dropDownHelper.selectByText(selectMenuPage.oldStyleSelectMenu, "Green");
        List<String> list =dropDownHelper.getAllDropDownValues(selectMenuPage.oldStyleSelectMenu);
        list.forEach(System.out::println);
        webElementHelper.sendKeys(selectMenuPage.selectValueInput, "Pro");
        selectMenuPage.selectValueInput.sendKeys(Keys.ENTER);

    }
}