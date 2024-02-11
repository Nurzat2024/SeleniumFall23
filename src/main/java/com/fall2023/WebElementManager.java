package com.fall2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import static com.fall2023.WebDriverManager.driver;

public class WebElementManager {
    public static Object openTheSite;
    // WebElement unauth = driver.findElement(By.partialLinkText("Unauth"));
    // WebElement forbidden= driver.findElement(By.linkText("Forbidden"));
    // WebElement permanentAddressInput =driver.findElement(By.id("permanentAddress"));



    public static WebElement retrieveByText(String linkText) {
        return driver.findElement(By.linkText(linkText));
    }

    public static WebElement retrieveById(String Id) {
        return driver.findElement(By.id(Id));
    }

    public static WebElement retrieveByClassName(String ClassName) {
        return driver.findElement(By.className(ClassName));
    }

    public static WebElement retrieveByPartialLinkText(String linkText) {
        return driver.findElement(By.partialLinkText(linkText));
    }
    public static WebElement retrieveByCssSelector(String cssSelector) {
        return driver.findElement(By.cssSelector(cssSelector));
    }

    public static void scrollPageBy(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, arguments[0])", pixels);
    }
    public static WebElement retrieveByXPath(String XPath) {
        return driver.findElement(By.xpath(XPath));
    }
}








