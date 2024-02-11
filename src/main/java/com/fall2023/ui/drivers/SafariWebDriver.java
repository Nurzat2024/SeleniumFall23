package com.fall2023.ui.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariWebDriver {
    public static WebDriver loadSafariDriver() {
        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        return driver;
    }
}