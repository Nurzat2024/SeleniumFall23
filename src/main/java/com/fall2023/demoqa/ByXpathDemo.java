package com.fall2023.demoqa;

import com.fall2023.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall2023.WebDriverManager.openTheSite;

public class ByXpathDemo extends BaseTest {
    @Test
    void  demo() throws InterruptedException {
        openTheSite("https://demoqa.com/text-box");

        WebElement fullNameInput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
        fullNameInput.sendKeys("Nurzat");
        Thread.sleep(5000);
//        /html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input
    }
}
