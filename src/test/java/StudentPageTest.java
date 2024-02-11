
import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.helper.WebElementHelper;
import com.fall2023.ui.pages.StudentPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.text.DateFormatSymbols;
import java.util.Locale;

public class StudentPageTest {
    WebDriver driver;
    StudentPage studentPage;
    WebElementHelper webElementHelper;

    @BeforeClass
    void setUpDriver() {
        driver = Driver.getDriver();
        studentPage = new StudentPage();

    }

    @Test
    void fillUpTheFormStudentInfo() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        studentPage.fillUpFirstName()
                .fillUpLastName()
                .fillUpEmail()
                .chooseGender()
                .fillUpMobileNumber();
        Faker faker = new Faker();
        String[] months = DateFormatSymbols.getInstance(Locale.ENGLISH).getMonths();
        int randomDay = faker.number().numberBetween(1, 31); // Генерация случайного числа для дня
        String randomMonth = months[faker.random().nextInt(0, months.length)]; // Получение случайного названия месяца
        int randomYear = faker.number().numberBetween(1900, 2023); // Генерация случайного числа для года
        String randomDate = String.format("%d %s %d", randomDay, randomMonth, randomYear);
        studentPage.selectDateMonthYear(randomDate)
                .selectSubjects()
                .scrollToElement(studentPage.inputSubject)
                .chooseHobbies()
                .chosePicture()
                .scrollToElement(studentPage.submitBtn)
                .fillUpCurrentAddress()
                .selectStateAndCity()
                .clickSubmitBtn()
                .clickCloseBtn();

driver.quit();
    }
}








