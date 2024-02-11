package com.fall2023;

import com.fall2023.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    protected WebDriver driver;
    protected Actions actions;

    protected WebDriverManager webDriverManager;

    @BeforeClass
    public void setUp() {//setUp-установить
        driver = WebDriverManager.initChromeDriver();
        actions =new Actions(driver);
    }

    @AfterClass
    public void tearDown() {//слезы вниз
        WebDriverManager.closeDriver();
    }
}

