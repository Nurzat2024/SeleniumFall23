import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.helper.BrowserManager;
import com.fall2023.ui.pages.PracticeFormPage;
import org.testng.annotations.Test;

import static com.fall2023.WebDriverManager.driver;
public class PracticeFormTest {

    @Test
    void demo123() {

        BrowserManager browserManager = new BrowserManager(Driver.getDriver());
        browserManager.openByNavigate("https://demoqa.com/automation-practice-form");
        PracticeFormPage practiceFormPage = new PracticeFormPage();
        practiceFormPage.selectDateMonthYear("5 March 2015");
        System.out.println();
//        Driver.closeDriver();//после закрытие сессии если мы хотим  обратно запустить то выходить ошибка
//        browserManager=new BrowserManager(Driver.getDriver());
////      browserManager.openByNavigate("https://demoqa.com/automation-practice-form");

    }

//    @Test
//    void demo124() {
//
//        BrowserManager browserManager = new BrowserManager(driver);
//        browserManager.openByNavigate("https://demoqa.com/automation-practice-form");
//        PracticeFormPage practiceFormPage = new PracticeFormPage();
//        practiceFormPage.selectDateMonthYear("5 March 2015");
//        System.out.println();
//
//        Driver.closeDriver();//после закрытие сессии если мы хотим  обратно запустить то выходить ошибка
//        Driver.getDriver();
//        browserManager.openByNavigate("https://demoqa.com/automation-practice-form");

    }




