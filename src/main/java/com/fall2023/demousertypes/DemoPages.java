package com.fall2023.demousertypes;


import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.helper.WebElementHelper;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DemoPages {
    public DemoPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebElementHelper webElementHelper = new WebElementHelper();
    @FindBy(xpath = "//a[normalize-space()='Add user type']")//на главной странице add User Type
    public WebElement addUserTypeInput;

    @FindBy(xpath = "//input [@id='user_type_name']")//Name
    public WebElement nameInput;

    @FindBy(xpath = "//span[@class='select2-arrow']")
    public WebElement arrowClickInput;//галочку нажимаем где находиться Administrator,Instructor,Learner

    @FindBy(xpath = "//div[text()='Administrator']")
    public WebElement adminInput;//Выбираем Administrator нажимаем

    @FindBy(xpath = "//div[text()='Instructor']")//Выбираем Instructor нажимаем
    public WebElement instructorInput;

    @FindBy(xpath = "//div[text()='Learner']")//Выбираем Learner нажимаем
    public WebElement learnerInput;


    @FindBy(xpath = "//*[@id='tl-user-types-tree']/ul/li[1]/span/span[2]")
    public WebElement tickTheBoxForAdmin;

    @FindBy(xpath = "//*[@id='tl-user-types-tree']/ul/li[2]/span/span[2]")
    public WebElement tickTheBoxForInstr;

    @FindBy(xpath = "//*[@id='tl-user-types-tree']/ul/li[3]/span/span[2]")
    public WebElement tickTheBoxForLearn;

    @FindBy(xpath = "//*[@id='tl-user-types-tree']/ul/li[4]/span/span[2]")
    public WebElement tickTheBoxForGen;
    @FindBy(xpath = "//a[text()='Administrator']")//Permissions Administrator
    public WebElement clickAdmin;

    @FindBy(xpath = "//a[text()='Instructor']")//Permissions Instructor
    public WebElement clickInstructor;

    @FindBy(xpath = "//a[text()='Learner']")//Permissions Learner
    public WebElement clickLearner;

    @FindBy(xpath = "//a[text()='General']")//Permissions General
    public WebElement clickGeneral;

    @FindBy(xpath = "//input[@id='user-type-save-button']")
    public WebElement saveBtn;

    ////input[@id='user-type-save-button']
    public DemoPages clickAddUserType() {
        webElementHelper.click(addUserTypeInput);
        return this;
    }

    Faker faker = new Faker();

    public DemoPages fillUpNameInput() {
//        List<String> professions = Arrays.asList("Manager", "Financial analyst", "Accountant", "Doctor",
//                "Biologist", "Professor", "Painter", "Architect", "Machinist", "Instructor", "Teacher");
//
//        for (int i = 0; i < 1; i++) {
//            int randomIndex = faker.random().nextInt(professions.size());
//            String profession = professions.get(randomIndex);
//            nameInput.sendKeys(profession);

//        webElementHelper.sendKeys(nameInput,"Ayzat");
        webElementHelper.sendKeys(nameInput,"Nurzat");
        return this;
    }
    public DemoPages arrowClick() {
        webElementHelper.click(arrowClickInput);
        return this;
    }
    public DemoPages adminClick() {         // по очереди запускаем
        webElementHelper.click(adminInput);
        return this;
    }
    public DemoPages instructorClick() {    // по очереди запускаем
        webElementHelper.click(instructorInput);
        return this;
    }

    public DemoPages learnerClick() {       // по очереди запускаем
        webElementHelper.click(learnerInput);
        return this;
    }

    public DemoPages tickTheBoxForAdministrator() {
        webElementHelper.click(tickTheBoxForAdmin);
        return this;
    }

    public DemoPages tickTheBoxForInstructor() {
        webElementHelper.click(tickTheBoxForInstr);
        return this;
    }

    public DemoPages tickTheBoxForLearner() {
        webElementHelper.click(tickTheBoxForLearn);
        return this;
    }

    public DemoPages tickTheBoxForGeneral() {
        webElementHelper.click(tickTheBoxForGen);
        return this;
    }

    public DemoPages clickOnTheAdminButton() {
        webElementHelper.click(clickAdmin);
        return this;
    }
    public DemoPages clickOnTheInstructorButton() {
        webElementHelper.click(clickInstructor);
        return this;
    }
    public DemoPages clickOnTheLearnButton() {
        webElementHelper.click(clickLearner);
        return this;
    }

    public DemoPages clickOnTheGeneralButton() {
        webElementHelper.click(clickGeneral);
        return this;
    }

    public DemoPages saveButton() {
        webElementHelper.click(saveBtn);
        return this;
    }
}