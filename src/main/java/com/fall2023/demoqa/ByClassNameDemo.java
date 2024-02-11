package com.fall2023.demoqa;

import com.fall2023.BaseTest;
import com.fall2023.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class ByClassNameDemo extends BaseTest {
    @Test
    void ByClassNameSite() {
        WebDriverManager.openTheSite("https://demoqa.com/text-box");
        WebElement usernameInput = driver.findElement(By.id("userName"));
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
        WebElement submitBtn = driver.findElement(By.className("btn-primary"));

        usernameInput.sendKeys("Nurzat");
        emailInput.sendKeys("nurzat.zarylbekova@gmail.com");
        currentAddressInput.sendKeys("WallStreet 555");
        permanentAddressInput.sendKeys("Sovet123");
        JavascriptExecutor js = (JavascriptExecutor) driver; //  что комнада что бы листать вниз
        js.executeScript("window.scrollBy(0, 600)");
        submitBtn.click();
    }
}
