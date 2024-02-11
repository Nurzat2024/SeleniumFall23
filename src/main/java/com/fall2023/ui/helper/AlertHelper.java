package com.fall2023.ui.helper;

import com.fall2023.ui.drivers.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {
    public Alert getAlert() {
        return Driver.getDriver().switchTo().alert();//driver возьми управление над аллертом.переключись на Allert
    }

    public void acceptAlert() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))//Duration-промежуток времени 7 секунд
                .until(ExpectedConditions.alertIsPresent());
        if (!isAlertPresent()){
            return;
        }
        getAlert().accept();
    }
    public void dismissAlert() { //dismissAlert-отклонить
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))////жди 7 секунд
                .until(ExpectedConditions.alertIsPresent());
        if (!isAlertPresent()){
            return;
        }
        getAlert().dismiss();
    }
    public void sendKeysAlert(String txt) {
        if (!isAlertPresent()){//если алерта нету остановись
            return;
        }
        getAlert().sendKeys(txt);
    }

    public boolean isAlertPresent(){
        try {
            Driver.getDriver().switchTo().alert();
            return true;
        }catch (NoAlertPresentException e){
            return false;
        }
    }
}

