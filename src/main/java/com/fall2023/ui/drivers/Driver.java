package com.fall2023.ui.drivers;

import com.fall2023.ui.config.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {
    private  Driver(){

    }
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
            switch (ConfigReader.getValue("browser").toLowerCase()){

                case "chrome":
                    driver=ChromeWebDriver.loadChromeDriver();
//                    TODO add firefox
                    break;
                    case "firefox":
                    driver= FireFoxDriver.loadFireWebDriver();
                    break;
                     //TODO add all drivers
                      case "safari":
                      driver= SafariWebDriver.loadSafariDriver();
                      break;
                  default:
                      throw  new IllegalArgumentException("You provided wrong Driver name");

            }
        }
        return driver;
    }
    public static  void closeDriver(){
        try {
            if(driver!=null){
                driver.close();
                driver.quit();
                driver=null;
            }
        }catch (Exception e){
            System.out.println("Error while clothing driver");
        }
    }
}
