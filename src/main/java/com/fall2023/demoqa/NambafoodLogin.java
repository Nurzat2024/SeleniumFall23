package com.fall2023.demoqa;
import com.fall2023.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class NambafoodLogin extends BaseTest {

    @Test
    void signUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://nambafood.kg/?language=en");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement loginBtn = driver.findElement(By.id("login--button"));
        loginBtn.click();

        WebElement signUp = driver.findElement(By.className("sign-tab"));
        signUp.click();

        WebElement emailInputField = driver.findElement(By.id("sda_user_registration_form_email"));
        WebElement nameInputField = driver.findElement(By.id("sda_user_registration_form_firstname"));
        WebElement surnameInputField = driver.findElement(By.id("sda_user_registration_form_lastname"));
        WebElement telephoneInputField = driver.findElement(By.id("sda_user_registration_form_phone"));
        WebElement password1InputField = driver.findElement(By.id("sda_user_registration_form_plainPassword_first"));
        WebElement password2InputField = driver.findElement(By.id("sda_user_registration_form_plainPassword_second"));
        WebElement agreeMark = driver.findElement(By.xpath("(//label[@for='access-offer'])[1]"));
        WebElement registerBtn = driver.findElement(By.id("_register-submit"));


        emailInputField.sendKeys("test@gmail.com");
        nameInputField.sendKeys("Anna");
        surnameInputField.sendKeys("Lavrova");
        telephoneInputField.sendKeys("0770700700");
        password1InputField.sendKeys("password123");
        password2InputField.sendKeys("password123");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");
        // agreeMark.click();
        registerBtn.click();
    }
}