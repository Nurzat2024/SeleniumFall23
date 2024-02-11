package com.fall2023.demoqa.Xpath;

import com.fall2023.BaseTest;
import com.fall2023.WebElementManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall2023.WebDriverManager.openTheSite;

public class HWCheckBox extends BaseTest {

    @Test
    void checkBoxTest() throws InterruptedException {
        openTheSite("https://demoqa.com/elements");
        WebElement checkBoxTest = WebElementManager.retrieveByXPath("//span[text()='Check Box']");
        checkBoxTest.click();

        WebElement homeBtn = WebElementManager.retrieveByXPath("//button[@title='Toggle']");
        homeBtn.click();
        Thread.sleep(6000);


        WebElement homeBtn2 =WebElementManager.retrieveByCssSelector(".rct-title");
        homeBtn2.click();
        String actualHomeBtn2 = WebElementManager.retrieveByXPath("//div[@id='result']").getText();


        Assert.assertEquals(actualHomeBtn2,"You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile");
        Thread.sleep(6000);
//    }
//        @Test
//        void desktopBtnTest() throws InterruptedException {
//            openTheSite("https://demoqa.com/elements");
//        WebElement desktopBtn = WebElementManager.retrieveByXPath("//span[text()='Desktop']");
//        desktopBtn.click();
//        String actualDesktopBtn = WebElementManager.retrieveByXPath("//div[@id='result']").getText();
//        Assert.assertEquals(actualDesktopBtn, "You have selected :\n" +
//                "desktop\n" +
//                "notes\n" +
//                "commands");
//        WebElement documentBtn = WebElementManager.retrieveByXPath("//span[text()='Documents']");
//        documentBtn.click();
//        String actualDocumentBtn = WebElementManager.retrieveByXPath("//div[@id='result']").getText();
//        Assert.assertEquals(actualDocumentBtn, "You have selected :\n" +
//                "desktop\n" +
//                "notes\n" +
//                "commands");
//        Thread.sleep(6000);
//
//        WebElement downloadBtn = WebElementManager.retrieveByXPath("//span[text()='Desktop']");
//        downloadBtn.click();
//        String actualDownloadBtn = WebElementManager.retrieveByXPath("//div[@id='result']").getText();
//        Assert.assertEquals(actualDownloadBtn, "You have selected :\n" +
//                "desktop\n" +
//                "notes\n" +
//                "commands");
//        Thread.sleep(6000);
       }
    }


