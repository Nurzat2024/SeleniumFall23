package com.fall2023.demoqa.waits;

import com.fall2023.BaseTest;
import com.fall2023.WebDriverManager;
import com.fall2023.WebElementManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class ExplicitWaitExample extends BaseTest {
 @Test
    void waitForElementToBeClickAble(){
     WebDriverManager.openTheSite("https://demoqa.com/dynamic-properties");
     WebElement willEnableAfter5SecondBtn = WebElementManager.retrieveById("enableAfter");

     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
     //жди до техпор до появление
     wait.until(ExpectedConditions.elementToBeClickable(willEnableAfter5SecondBtn)).click();
     WebElement visiableAfter5Secs = WebElementManager.retrieveById("visibleAfter");
     wait.until(ExpectedConditions.visibilityOf(visiableAfter5Secs)).click();
     WebElement dangerColor = WebElementManager.retrieveById("colorChange");
     wait.until(ExpectedConditions.attributeContains(dangerColor,"class","danger"));
     System.out.println(dangerColor.getAttribute("class"));






 }

}
