package com.fall2023.demoqa.Xpath;


import com.fall2023.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.fall2023.WebDriverManager.openTheSite;

    public class Download extends BaseTest {
        @Test
        void downloadTest() throws InterruptedException {
            openTheSite("https://demoqa.com/upload-download");
            driver.findElement(By.id("uploadFile")).sendKeys("/Users/nurzatzarylbekova/Downloads/sampleFile.jpeg");  //Ctrl+Shift+C
            Thread.sleep(5000);
        }
    }


