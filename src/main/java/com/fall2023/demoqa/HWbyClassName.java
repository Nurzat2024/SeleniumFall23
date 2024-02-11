package com.fall2023.demoqa;

import com.fall2023.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static com.fall2023.WebElementManager.retrieveByClassName;
import static com.fall2023.WebDriverManager.openTheSite;
import static com.fall2023.WebElementManager.scrollPageBy;

public class HWbyClassName extends BaseTest {


    @Test
    void byClassTextBox() throws InterruptedException {
        openTheSite("https://demoqa.com/text-box");
        WebElement submitBth = retrieveByClassName("btn-primary");
        scrollPageBy(600);
        submitBth.click();
        Thread.sleep(5000);
    }

    @Test
    void byClassFullName() throws InterruptedException {
        openTheSite("https://demoqa.com/text-box");
        WebElement fullName = retrieveByClassName("mr-sm-2");
        fullName.click();
        Thread.sleep(5000);

    }

    @Test
    void byClassCheckBox() throws InterruptedException {
        openTheSite("https://demoqa.com/checkbox");
        WebElement checkBox = retrieveByClassName("active");
        checkBox.click();
        WebElement home = retrieveByClassName("rct-title");
        home.click();
        Thread.sleep(5000);
    }
}







