package com.fall2023.demoqa.MouseInteractions;

import com.fall2023.BaseTest;
import com.fall2023.WebElementManager;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.fall2023.WebDriverManager.openTheSite;

public class AdvancedMouseInteractions extends BaseTest {

    @Test
    void doubleClickTest() throws InterruptedException {
        openTheSite("https://demoqa.com/buttons");
        WebElement doubleClickBtn = WebElementManager.retrieveById("doubleClickBtn");

        actions.doubleClick(doubleClickBtn).perform();
        Thread.sleep(6000);

        String actualDoubleClick1mess = WebElementManager.retrieveById("doubleClickMessage").getText();
        String expectedDoubleClick1mess = "You have done a double click";
        Assert.assertEquals(actualDoubleClick1mess, expectedDoubleClick1mess);
        Thread.sleep(6000);

    }

    @Test
    void rightClickTest() throws InterruptedException {
        openTheSite("https://demoqa.com/buttons");
        WebElement rightClickBtn = WebElementManager.retrieveById("rightClickBtn");
        actions.contextClick(rightClickBtn).perform();
        String actualRightClickMessage = WebElementManager.retrieveById("rightClickMessage").getText();
        Assert.assertEquals(actualRightClickMessage, "You have done a right click");
        Thread.sleep(5000);

    }

    @Test
    void ClickMe() throws InterruptedException {
        openTheSite("https://demoqa.com/buttons");
        WebElement clickMe = WebElementManager.retrieveByXPath("//button[text()='Click Me']");
        actions.click(clickMe).perform();
        String actualDynamicClickMess = WebElementManager.retrieveById("dynamicClickMessage").getText();
        Assert.assertEquals(actualDynamicClickMess, "You have done a dynamic click");
        Thread.sleep(5000);
    }

}

