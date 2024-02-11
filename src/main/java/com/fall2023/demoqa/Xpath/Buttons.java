package com.fall2023.demoqa.Xpath;

import com.fall2023.BaseTest;
import com.fall2023.WebElementManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.fall2023.WebDriverManager.openTheSite;

public class Buttons extends BaseTest {

    @Test
    void doubleClick() throws InterruptedException {
        openTheSite("https://demoqa.com/buttons");
        WebElement doubleClick = WebElementManager.retrieveByXPath("//button[@id='doubleClickBtn']");
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClick).perform();
        Thread.sleep(6000);

        WebElement doubleClick1 = driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
        String actualDoubleClick1mess = doubleClick1.getText();
        String expectedDoubleClick1mess = "You have done a double click";
        Assert.assertEquals(actualDoubleClick1mess, expectedDoubleClick1mess);
    }


     @Test
     void rightClickMe() throws InterruptedException {
         openTheSite("https://demoqa.com/buttons");
         WebElement rightClickMe = WebElementManager.retrieveByXPath("//button[@id='rightClickBtn']");
         Actions actions = new Actions(driver);
         actions.contextClick(rightClickMe).perform();
         Thread.sleep(6000);

         WebElement rightClickMe1 = driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
         String actualRightClick1mess = rightClickMe1.getText();
         String expectedRightClick1mess = "You have done a right click";
         Assert.assertEquals(actualRightClick1mess,expectedRightClick1mess);


        }
    @Test
    void ClickMe() throws InterruptedException {
        openTheSite("https://demoqa.com/buttons");
        WebElement clickMe = WebElementManager.retrieveByXPath("//button[text()='Click Me']");
        Actions actions = new Actions(driver);
        actions.click(clickMe).perform();
        Thread.sleep(6000);


        WebElement clickMe1 = driver.findElement(By.xpath("//p[contains(text(), 'You have done a dynamic click')]"));
        String actualClick1mess = clickMe1.getText();
        String expectedClick1mess = "You have done a dynamic click";
        Assert.assertEquals(actualClick1mess,expectedClick1mess);
    }

    }

