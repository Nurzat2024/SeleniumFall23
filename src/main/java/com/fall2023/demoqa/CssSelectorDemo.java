package com.fall2023.demoqa;


import com.fall2023.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CssSelectorDemo extends BaseTest {

    @Test
    void demo123() {

        // Find element by CSS selector using text content
        WebElement userNameInput = driver.findElement(By.cssSelector("#userName"));
        userNameInput.sendKeys("John Doe");

        WebElement emailInput = driver.findElement(By.cssSelector("input[type='email']"));
        emailInput.sendKeys("johnDoe@gmail.com");

        WebElement currentAddress = driver.findElement(By.cssSelector(".form-label#currentAddress-label"));
        currentAddress.sendKeys("Karakol");
    }
}