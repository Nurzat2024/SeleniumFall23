package com.fall2023.ui.pages;

import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.helper.WebElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStoreLoginPage {

        public BookStoreLoginPage() {
                PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//button[@id='newUser']")
        public WebElement clickToNewUser;

        @FindBy(xpath = "//input[@id='firstname']")
        public WebElement firstNameInput;

        @FindBy(xpath = "//input[@id='lastname']")
        public WebElement lastNameInput;

        @FindBy(css = "#userName")
        public WebElement UserNameInput;
        @FindBy(css = "#password")
        public WebElement passwordInput;
        @FindBy(xpath = "//button[@id='register']")
        public WebElement clickToRegister;

        WebElementHelper webElementHelper = new WebElementHelper();

        public BookStoreLoginPage clickToNewUser(){
                webElementHelper.scrollToElement(clickToNewUser);
                clickToNewUser.click();
                return this;
        }

        public BookStoreLoginPage fillUpFirstName(String FirstName) {
                webElementHelper.sendKeys(firstNameInput, FirstName);
                return this;
        }

        public BookStoreLoginPage fillUpLastName(String lastName) {
                webElementHelper.sendKeys(lastNameInput, lastName);
                return this;
        }

        public BookStoreLoginPage fillUpUserNameInput(String userName) {
                webElementHelper.sendKeys(UserNameInput, userName);
                return this;
        }

        public BookStoreLoginPage fillUpPasswordInput(String password){
                webElementHelper.sendKeys(passwordInput,password)
                        .scrollToElement(clickToRegister);
                return this;
        }

        public BookStoreLoginPage clickToRegisterBtn() {
                webElementHelper.click(clickToRegister);
                return this;
        }


        public BookStoreLoginPage clickOnCaptcha(WebDriver driver) {

                WebElement iframe = driver.findElement(By.cssSelector("iframe[src*='recaptcha']"));
                driver.switchTo().frame(iframe);

                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("document.getElementById('recaptcha-anchor').click();");

                driver.switchTo().defaultContent();
                return this;

        }

}






