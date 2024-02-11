package com.fall2023.ui.helper;

import org.openqa.selenium.WebDriver;

public class BrowserManager {
    private WebDriver driver;

    public BrowserManager(WebDriver driver){
        this.driver = driver;
    }
    public void openByNavigate(final String URL){
        driver.navigate().to(URL);
    }
    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
        driver.navigate().forward();
    }
    public void refreshThePage(){
        driver.navigate().refresh();

        //TODO move all method like:Frame,Window
    }
}
