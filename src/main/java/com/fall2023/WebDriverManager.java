package com.fall2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverManager {

    public static WebDriver driver;

    public static WebDriver initChromeDriver() {//первый метод инициализировать наш проект
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver(){//второй метод для того чтобы закрывать
        driver.close();
        driver.quit();
    }

    public static void openTheSite(String URL){//для того чтобы открыть какой то сайт
        driver.get(URL);
    }

}