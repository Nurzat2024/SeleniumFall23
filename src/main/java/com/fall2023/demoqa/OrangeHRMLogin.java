package com.fall2023.demoqa;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMLogin {

    @Test(description = "Login with valid username and valid password")
    void loginWithValidUsernameAndValidPasswordTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver-mac-arm64/chromedriver");//путь
        WebDriver driver = new ChromeDriver();//обьект
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//ссылка
        driver.manage().window().maximize();//полное окно
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//промежуток времени

        String actualLoginText = driver.findElement(By.tagName("h5")).getText();// проверь
        String expectedLoginText = "Login";//проверь
        Assert.assertEquals(actualLoginText, expectedLoginText);

        String username = "Admin";
        String password = "admin123";

        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);//заполняй
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String actualDashboardText = driver.findElement(By.tagName("h6")).getText();
        String expectedDashboardText = "Dashboard";
        Assert.assertEquals(actualDashboardText, expectedDashboardText);
    }

    @Test(description = "login with invalid username and valid password")
    void loginWithInValidUsernameAndValidPasswordTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();// управлять , окном, открыть на полную
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String username = "Meerim";
        String password = "admin123";
        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));
        usernameInputField.sendKeys(username);    // метод можно водить данные ;
        passwordInputField.sendKeys(password);
        WebElement loginBtn = driver.findElement(By.tagName("button")); // tag по названию тега
        loginBtn.click();

        String actualuserInvalid = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
        String expexteduserInvalid = "Invalid credentials";
        Assert.assertEquals(actualuserInvalid, expexteduserInvalid);

    }

    @Test(description = "Login with valid username and valid password")
    void loginWithInValidUsernameAndValidPasswordTesst() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        String username = "Admin";
        String password = "guli3456";
        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));
        usernameInputField.sendKeys(username);    // метод можно водить данные ;
        passwordInputField.sendKeys(password);
        WebElement loginBtn = driver.findElement(By.tagName("button")); // tag по названию тега
        loginBtn.click();
        String actualpasswordInvalid = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
        String expextedpasswordInvalid = "Invalid credentials";
        Assert.assertEquals(actualpasswordInvalid, expextedpasswordInvalid);

    }

    @Test(description = "Login with valid username and valid password")
    void PerformanceTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        String username = "Admin";
        String password = "admin123";

        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String actualDashboardText = driver.findElement(By.xpath("//span[normalize-space()='Performance']")).getText();
        String expectedDashboardText = "Performance";
        Assert.assertEquals(actualDashboardText, expectedDashboardText);

        WebElement performanceBtn = driver.findElement(By.xpath("//span[normalize-space()='Performance']"));
        performanceBtn.click();
    }

    @Test(description = "Login with valid username and valid password")
    void loginWithValidUsernameAndValidPasswordTest1() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        String actualLoginText = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).getText();
        String expectedLoginText = "Forgot your password?";
        Assert.assertEquals(actualLoginText, expectedLoginText);

        WebElement forgetBtn = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        forgetBtn.click();

        String userNameReset = "Admin";


        WebElement userNameInputFieldReset = driver.findElement(By.name("username"));

        userNameInputFieldReset.sendKeys(userNameReset);

        WebElement resetBtn = driver.findElement(By.xpath("//button[2]"));
        resetBtn.click();

    }

    @Test(description = "Login with valid username and valid password")
    void Search() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        String actualLoginText = driver.findElement(By.tagName("h5")).getText();
        String expectedLoginText = "Login";
        Assert.assertEquals(actualLoginText, expectedLoginText);

        String userName = "Admin";
        String password = "admin123";

        WebElement userNameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        userNameInputField.sendKeys(userName);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        WebElement searchBtn = driver.findElement(By.xpath("//input[1]"));
        searchBtn.click();
        WebElement searchInputFielt = driver.findElement(By.xpath("//input[1]"));
        searchInputFielt.sendKeys("Admin");
        WebElement searchInputFielt1 = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']"));
        searchInputFielt1.click();

        WebElement userNameInputField1=driver.findElement((By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")));
        userNameInputField1.sendKeys("Ali Raza Junior");
        WebElement UserRoleInputField2=driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
        UserRoleInputField2.click();

//        WebElement AdminInputField3=driver.findElement(By.xpath("//div[@class='oxd-select-text-input'][normalize-space()='Admin']"));
//        AdminInputField3.submit();
    }
}


