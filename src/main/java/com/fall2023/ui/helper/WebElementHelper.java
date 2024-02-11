package com.fall2023.ui.helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.fall2023.ui.drivers.Driver;


import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

public class WebElementHelper {

    private Select select;


    public WebElementHelper waitForButtonToBeClickAble(WebElement element) {//Метод ожидатьКнопкуНаКликнуть принимает
        // элемент (кнопку) в качестве параметра и ожидает, пока этот элемент станет доступным для клика..
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public WebElementHelper waitForElementToBeDisplayed(WebElement element) {//Ожидание отображения элемента.
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;

    }

    public WebElementHelper click(WebElement element) {//Нажать
        waitForButtonToBeClickAble(element);
        element.click();
        return this;
    }

    public WebElementHelper sendKeys(WebElement element, String txt) {
        waitForElementToBeDisplayed(element);
        element.sendKeys(txt);
        return this;
    }

    public WebElementHelper scrollToElement(WebElement element) {//Прокрутить к элементу
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }
    public WebElementHelper sendKeysWithEnter(WebElement element,String txt){
        waitForElementToBeDisplayed(element);
        element.sendKeys(txt);
        element.sendKeys(Keys.ENTER);
        return this;
    }
    public WebElementHelper selectByText (WebElement element,String txt){
        select = new Select(element);
        select.selectByVisibleText(txt);
        return  this;
    }
    public WebElementHelper selectByIndex(WebElement element,int index){
        select = new Select(element);
        select.selectByIndex(index);
        return this;
    }
    public WebElementHelper selectByValue(WebElement element,String value){
        select = new Select(element);
        select.selectByValue(value);
        return this;
    }
    public List<String> getAllDropDownValue (WebElement element){
        //Получить все значения выпадающего списка
        select = new Select(element);
        //список всех атрибутов Options
        List<WebElement> elementList = select.getOptions();
        //пустой список
        List<String> valuelist = new LinkedList<>();

        for (WebElement element1:elementList){
         // уже с значением blue
            valuelist.add(element1.getText());

        }
        return valuelist;
    }



}




