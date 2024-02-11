package com.fall2023.ui.pages;

import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.helper.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {
    public CheckBoxPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = ".rct-collapse-btn")
    public WebElement clickToDimont;

    @FindBy(xpath = "//span[text()='Desktop']")
    public WebElement clickToDesktop;

    @FindBy(xpath = "//span[text()='Documents']")
    public WebElement clickToDocuments;
    @FindBy(xpath = "//span[text()='Downloads']")
    public WebElement clickToDownloads;
    @FindBy(css = ".rct-title")
    public WebElement homeNameClick;
    WebElementHelper webElementHelper = new WebElementHelper();


    public CheckBoxPage clickHome() {
        webElementHelper.click(clickToDimont);
        return this;
    }

    public CheckBoxPage clickToDesktop() {
        webElementHelper.click(clickToDesktop);
        return this;


    }

    public CheckBoxPage clickToDocuments() {
        webElementHelper.click(clickToDocuments);
        return this;
    }

    public CheckBoxPage clickToDownloads() {
        webElementHelper.click(clickToDownloads);
        return this;
    }


    }






