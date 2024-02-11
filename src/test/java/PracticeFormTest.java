import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.helper.BrowserManager;
import com.fall2023.ui.pages.PracticeFormPage;
import org.testng.annotations.Test;

public class PracticeFormTest {

    @Test
    void demo123(){

        BrowserManager browserManager = new BrowserManager(Driver.getDriver());
        browserManager.openByNavigate("https://demoqa.com/automation-practice-form");
        PracticeFormPage practiceFormPage = new PracticeFormPage();
        practiceFormPage.selectDateMonthYear("5 March 2015");
    }
}

