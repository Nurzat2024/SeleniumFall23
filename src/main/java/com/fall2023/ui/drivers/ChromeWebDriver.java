package com.fall2023.ui.drivers;

import com.fall2023.ui.config.ConfigReader;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeWebDriver {

    public static WebDriver loadChromeDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver-mac-arm64/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");//отключить расширения
        options.addArguments("--window-size-1920-1080");//параметр окна
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);//по умолчанию NORMAL

        if(Boolean.parseBoolean(ConfigReader.getValue("headless"))){
        options.addArguments("--headless");//не заходя браузер headless по умолчанию запускает тест
        }
        WebDriver driver =new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
}
