package com.fall2023.demoqa;

import com.fall2023.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static com.fall2023.WebElementManager.*;

import static com.fall2023.WebDriverManager.openTheSite;
import static com.fall2023.WebElementManager.retrieveByPartialLinkText;

public class HWpartialLinkTexsTest extends BaseTest {
    @Test
    void partialLinc1() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement Unauth = retrieveByPartialLinkText("Unauth");
        scrollPageBy(600);
        Unauth.click();
        Thread.sleep(5000);
    }

    @Test
    void partialLinc2() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement Ho = retrieveByPartialLinkText("Ho");
        scrollPageBy(600);
        Ho.click();
        Thread.sleep(5000);
    }

    @Test
    void partialLinc3() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement Crea = retrieveByPartialLinkText("Crea");
        scrollPageBy(600);
        Crea.click();
        Thread.sleep(5000);

    }

    @Test
    void partialLinc4() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement nocontent = retrieveByPartialLinkText("No");
        scrollPageBy(600);
        nocontent.click();
        Thread.sleep(5000);

    }

    @Test
    void partialLinc5() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement moved = retrieveByPartialLinkText("Mo");
        scrollPageBy(600);
        moved.click();
        Thread.sleep(5000);

    }

    @Test
    void partialLinc6() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement badrequest = retrieveByPartialLinkText("Bad");
        scrollPageBy(600);
        badrequest.click();
        Thread.sleep(5000);
    }
    @Test
    void partialLinc7() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement forbidden = retrieveByPartialLinkText("Forb");
        scrollPageBy(600);
        forbidden.click();
        Thread.sleep(5000);
    }
    @Test
    void partialLinc8() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement notfound = retrieveByPartialLinkText("Not");
        scrollPageBy(600);
        notfound.click();
        Thread.sleep(5000);
    }
}

