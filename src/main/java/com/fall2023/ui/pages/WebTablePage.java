package com.fall2023.ui.pages;

import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.entity.Employee;
import com.fall2023.ui.helper.WebElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {
    private WebDriver driver;


    public WebTablePage(WebDriver driver) {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    public WebTablePage fillUpTheForm(Employee employee) {
        WebElementHelper webElementHelper = new WebElementHelper();
        webElementHelper.click(driver.findElement(By.id("addNewRecordButton")))
                .sendKeys(driver.findElement(By.id("firstName")), employee.getFirstName())
                .sendKeys(driver.findElement(By.id("lastName")), employee.getLastName())
                .sendKeys(driver.findElement(By.id("userEmail")), employee.getEmail())
                .sendKeys(driver.findElement(By.id("age")), String.valueOf(employee.getAge()))
                .sendKeys(driver.findElement(By.id("salary")), String.valueOf(employee.getSalary()))
                .sendKeys(driver.findElement(By.id("department")), employee.getDepartment())
                .click(driver.findElement(By.id("submit")));
        return this;
    }
}