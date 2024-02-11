package com.fall2023.demoqa;

import com.fall2023.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall2023.WebDriverManager.openTheSite;

public class ByClassName extends BaseTest {
    @Test
    void byClassNameTest(){
        openTheSite("https://demoqa.com/text-box");
        WebElement submitBth = driver.findElement(By.className("btn-primary"));

    }
}
