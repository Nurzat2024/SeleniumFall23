package com.fall2023.demoqa;


import com.fall2023.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall2023.WebDriverManager.openTheSite;


public class ByID extends BaseTest {
    @Test
    void byIdTest(){
      openTheSite("https://demoqa.com/text-box");
      WebElement usernameInput = driver.findElement(By.id("userName"));
      WebElement emailInput = driver.findElement(By.id("userEmail"));
      WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
      WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
      WebElement submitBtn = driver.findElement(By.id("submit"));

            usernameInput.sendKeys("Nurzat");
            emailInput.sendKeys("nurzat.zarylbekova@gmail.com");
            currentAddressInput.sendKeys("Wallstreet 555");
            permanentAddressInput.sendKeys("Sovet 123");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 600)");
            submitBtn.click();
        }

    }


