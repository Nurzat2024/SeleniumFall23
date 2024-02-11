package com.fall2023.demoqa;

import com.fall2023.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import static com.fall2023.WebDriverManager.openTheSite;

public class PartialLinkTextTest extends BaseTest {

    @Test
    void demo() throws InterruptedException{
        openTheSite("https://demoqa.com/links");
        WebElement Unauth = driver.findElement(By.partialLinkText("Unauth"));
        JavascriptExecutor js = (JavascriptExecutor) driver; // это комнада для того чтобы листать вниз
        js.executeScript("window.scrollBy(0, 600)");
        Unauth.click();
        Thread.sleep(5000);
    }
}
