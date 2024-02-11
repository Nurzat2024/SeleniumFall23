package com.fall2023.demoqa;

import com.fall2023.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static com.fall2023.WebDriverManager.openTheSite;
import static com.fall2023.WebElementManager.retrieveByText;

public class HWLinkedTextTest extends BaseTest {

    @Test
    void test1() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement home = retrieveByText("Home");
        home.click();
        Thread.sleep(5000);
    }

    @Test
    void test2() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement created = retrieveByText("Created");
        created.click();
        Thread.sleep(5000);
    }

    @Test
    void test3() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement nocontent = retrieveByText("No Content");
        nocontent.click();
        Thread.sleep(5000);
    }

    @Test
    void test4() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement moved = retrieveByText("Moved");
        moved.click();
        Thread.sleep(5000);
    }

    @Test
    void test5() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement badrequest = retrieveByText("Bad Request");
        badrequest.click();
        Thread.sleep(5000);

    }

    @Test
    void test6() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement unauthorized = retrieveByText("Unauthorized");
        unauthorized.click();
//        scrollPageBy(600);
        Thread.sleep(5000);
    }

//    @Test
//    void test7() throws InterruptedException {
//        openTheSite("https://demoqa.com/links");
//        WebElement forbidden = retrieveByText("Forbidden");
//        forbidden.click();
//
//        Thread.sleep(5000);
//    }


//    @Test
//    void test8() throws InterruptedException {
//        openTheSite("https://demoqa.com/links");
//        WebElement notfound = retrieveByText("Not Found");
//        notfound.click();
//        scrollPageBy(6000);
//        Thread.sleep(5000);


    }





