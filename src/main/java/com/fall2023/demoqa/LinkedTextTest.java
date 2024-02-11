package com.fall2023.demoqa;

import com.fall2023.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall2023.WebDriverManager.openTheSite;
import static com.fall2023.WebElementManager.scrollPageBy;

public class LinkedTextTest extends BaseTest {


     @Test
    void test123() throws InterruptedException {
         openTheSite("https://demoqa.com/links");
         WebElement home =driver.findElement(By.linkText("Home"));
         home.click();
         scrollPageBy(600);
         Thread.sleep(5000);
     }


}

