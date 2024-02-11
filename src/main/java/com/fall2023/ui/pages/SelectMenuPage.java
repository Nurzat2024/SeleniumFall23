package com.fall2023.ui.pages;

import com.fall2023.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectMenuPage {
    public SelectMenuPage() {
        //инициализирует элементы страницы используя аннотации @FindBy, в соответствии с переданным драйвером
        // (Driver.getDriver()) и объектом страницы (this).
                PageFactory.initElements(Driver.getDriver(),this);
            }
            @FindBy(id = "oldSelectMenu")
            public WebElement oldStyleSelectMenu;

            @FindBy(id = "react-select-3-input")
            public WebElement selectValueInput;
        }
















