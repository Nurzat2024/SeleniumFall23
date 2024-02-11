package com.fall2023.demoqa;

import com.fall2023.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall2023.WebElementManager.*;
import static com.fall2023.WebDriverManager.openTheSite;

public class HWbyID extends BaseTest {
    @Test
    void test1()throws InterruptedException  {

        openTheSite("https://demoqa.com/text-box");
        WebElement usernameInput = retrieveById("userName");
        WebElement emailInput = retrieveById("userEmail");
        WebElement currentAddressInput = retrieveById("currentAddress");
        WebElement permanentAddressInput = retrieveById("permanentAddress");
        WebElement submitBtn = retrieveById("submit");

        usernameInput.sendKeys("Nurzat");
        emailInput.sendKeys("nurzat.zarylbekova@gmail.com");
        currentAddressInput.sendKeys("Wallstreet 555");
        permanentAddressInput.sendKeys("Sovet 123");
        scrollPageBy(600);
        submitBtn.click();
        Thread.sleep(5000);

    }
}



