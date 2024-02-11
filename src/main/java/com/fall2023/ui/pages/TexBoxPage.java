package com.fall2023.ui.pages;

import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.helper.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TexBoxPage {

    public TexBoxPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "userName")
    public WebElement fullNameInput;
    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    WebElementHelper webElementHelper = new WebElementHelper();

    public TexBoxPage fillUpFullName(String fullName) {
        webElementHelper.sendKeys(fullNameInput, fullName);
        return this;
    }

    public TexBoxPage fillUpEmail(String email) {
        webElementHelper.sendKeys(emailInput, email);
        return this;
    }

    public TexBoxPage fillUpCurrentAddress(String currentAddress) {
        webElementHelper.sendKeys(currentAddressInput, currentAddress);
        return this;
    }

    public TexBoxPage fillUpPermanentAddress(String permanentAddress) {
        webElementHelper.sendKeys(permanentAddressInput, permanentAddress);
        return this;
    }

    public TexBoxPage submitBtn() {
        webElementHelper.click(submitBtn);
        return this;
    }



}


