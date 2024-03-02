import com.fall2023.ui.data.JavaFaker;
import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.entity.Employee;
import com.fall2023.ui.pages.WebTablePage;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

import static com.fall2023.ui.entity.Employee.getEmployeeFromTable;

@Epic("WebTable")//ok                     Epic-большая команда
public class EmployeeTableTest {

    @Test
    @Feature("Demode webTable")//ok
    @AllureId("123") // no
    @Description("Verify all employee data in webTable") //ok
    @Flaky// depends on functionality //ok Flaky-не стабильные тесты
    @Issue("Can not save the data")   //no Issue-какая то проблема
    @Link("https://www.amazon.com/")  //no Link- мы может положит ссылку
    @Owner("Nurzat") // ok
    @Severity(SeverityLevel.CRITICAL) //ok Severity-серъезность этого теста
    @Story("TL-011") // ok                 Story-какая то история
    @TmsLink("")  // no                    TmsLink-ссылка на тест кейс
    @Tag("Smoke") // ok                    Tag-помечать,метка
    void test123() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/webtables");
        Thread.sleep(3000);
        Employee randomEmployee = JavaFaker.createNewEmployeeWithFakeData();
        WebTablePage webTablePage = new WebTablePage(driver);
        webTablePage.fillUpTheForm(randomEmployee);
        List<Employee> employees = getEmployeeFromTable(driver);
        employees.forEach(System.out::println);//метод-stream api
        System.out.println(randomEmployee);
        Assert.assertEquals(1,2);
        Driver.closeDriver();

    }
        @Test
         @Feature("Demoqa webtale")
            @AllureId("123")
        void test124 () {
            WebDriver driver = Driver.getDriver();
            driver.get("https://demoqa.com/webtables");
            Employee randomEmployee = JavaFaker.createNewEmployeeWithFakeData();
            WebTablePage webTablePage = new WebTablePage(driver);
            webTablePage.fillUpTheForm(randomEmployee);
            List<Employee> employees = getEmployeeFromTable(driver);
            Employee lastEmployee = employees.get(employees.size() - 1);

            Assert.assertEquals(randomEmployee, lastEmployee);
            System.out.println(randomEmployee);
            System.out.println(lastEmployee);

        }
    }


