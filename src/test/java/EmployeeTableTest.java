import com.fall2023.ui.data.JavaFaker;
import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.entity.Employee;
import com.fall2023.ui.pages.WebTablePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



import java.util.List;

import static com.fall2023.ui.entity.Employee.getEmployeeFromTable;

public class EmployeeTableTest {
    @Test
    void test123() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/webtables");
        Employee randomEmployee = JavaFaker.createNewEmployeeWithFakeData();
        WebTablePage webTablePage = new WebTablePage(driver);
        webTablePage.fillUpTheForm(randomEmployee);
        List<Employee> employees = getEmployeeFromTable(driver);
        employees.forEach(System.out::println);//метод-stream api
        System.out.println(randomEmployee);


    }

    @Test
    void test124() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/webtables");
        Employee randomEmployee = JavaFaker.createNewEmployeeWithFakeData();
        WebTablePage webTablePage = new WebTablePage(driver);
        webTablePage.fillUpTheForm(randomEmployee);
        List<Employee> employees = getEmployeeFromTable(driver);
        Employee lastEmployee = employees.get(employees.size() - 1);

        Assert.assertEquals(randomEmployee,lastEmployee);
        System.out.println(randomEmployee);
        System.out.println(lastEmployee);



    }
}

