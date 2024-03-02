package com.fall2023.ui.pages;

import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.helper.DropDownHelper;
import com.fall2023.ui.helper.WebElementHelper;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

import java.util.*;

public class StudentPage {
    Faker faker = new Faker();
    WebDriver driver = Driver.getDriver();
    Random randomRadioBtn = new Random();
    WebElementHelper webElementHelper = new WebElementHelper();
    Random random = new Random();


    public StudentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "firstName")
    public WebElement inputFistName;

    @FindBy(id = "lastName")
    public WebElement inputLastName;
    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElement inputEmail;

    @FindBy(id = "userNumber")
    public WebElement inputMobileNumber;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirth;

    @FindBy(id = "subjectsInput")
    public WebElement inputSubject;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    public WebElement sportsBTN;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    public WebElement readingBTN;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    public WebElement musicBTN;

    @FindBy(id = "uploadPicture")
    public WebElement pictureBtn;

    @FindBy(id = "currentAddress")
    public WebElement inputCurrentAddress;
    @FindBy(id = "react-select-3-input")
    public WebElement stateInput;

    @FindBy(id = "react-select-4-input")
    public WebElement cityInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;
    @FindBy(id = "closeLargeModal")
    public WebElement closeBtn;


    public StudentPage fillUpFirstName() {
        inputFistName.sendKeys(faker.name().firstName());
        return this;
    }

    public StudentPage fillUpLastName() {
        inputLastName.sendKeys(faker.name().lastName());
        return this;
    }

    public StudentPage fillUpEmail() {
        inputEmail.sendKeys(faker.internet().emailAddress());
        return this;
    }

    public StudentPage fillUpMobileNumber() {
        inputMobileNumber.sendKeys(faker.phoneNumber().subscriberNumber(10));
        return this;


    }

    public StudentPage chooseGender() {

        List<WebElement> radioButtons = driver.findElements(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']"));
        int randomNumber = randomRadioBtn.nextInt(3);
        webElementHelper.click(radioButtons.get(randomNumber));
        return this;
    }
    public StudentPage selectDateMonthYear(String dateMonthYear) {
        String[] dateMonthYearParts = dateMonthYear.split(" ");
        String day = dateMonthYearParts[0];
        String month = dateMonthYearParts[1];
        String year = dateMonthYearParts[2];
        WebElementHelper webElementHelper = new WebElementHelper();
        webElementHelper.click(dateOfBirth);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement monthDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("react-datepicker__month-select")
        ));
        WebElement yearDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("react-datepicker__year-select")));
        DropDownHelper dropDownHelper = new DropDownHelper();
        // Select Month
        dropDownHelper.selectByText(monthDropDown, month)
                //Select year
                .selectByText(yearDropDown, year);
        WebElement dayElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(
                        "//div[contains(@class,'react-datepicker__day') and not(contains(" +
                                "@class,'react-datepicker__day--outside-month')) and text()='" + day + "']")));
        webElementHelper.click(dayElement);
        return this;
    }

    public StudentPage selectSubjects() {
        List<String> subjects = Arrays.asList("Ma", "Sci", "Eng", "Hi",
                "Che", "Com", "Bio", "Ph", "Hi", "Ar", "Acc",
                "Social Studies");
        for (int i = 0; i < 5; i++) {
            int randomIndex = faker.random().nextInt(subjects.size());
            String subject = subjects.get(randomIndex);
            inputSubject.sendKeys(subject);
            inputSubject.sendKeys(Keys.TAB);
        }
        return this;
    }

    public StudentPage scrollToElement(WebElement element) {//Прокрутить к элементу
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }

    public StudentPage chooseHobbies() {

        List<WebElement> studentPageBtn = Arrays.asList(readingBTN, musicBTN, sportsBTN);
        Faker faker = new Faker();
        int randomIndex = faker.random().nextInt(1, 3);
        Collections.shuffle(studentPageBtn);
        for (int i = 0; i < randomIndex; i++) {
            studentPageBtn.get(i).click();
        }
        return this;
    }

    public StudentPage chosePicture() {
        String directoryPath = "/Users/nurzatzarylbekova/Desktop/Picture";
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        File randomFile = files[random.nextInt(files.length)];
        String absolutePath = randomFile.getAbsolutePath();
        pictureBtn.sendKeys(absolutePath);
        return this;
    }

    public StudentPage fillUpCurrentAddress() {
        inputCurrentAddress.sendKeys(faker.address().fullAddress());
        return this;
    }

    public StudentPage selectStateAndCity() {
        webElementHelper.scrollToElement(stateInput);
        Map<String, List<String>> stateCityMapping = new HashMap<>();
        stateCityMapping.put("N", Arrays.asList("De", "Gu", "No"));
        stateCityMapping.put("U", Arrays.asList("A", "Lu", "Me"));
        stateCityMapping.put("Har", Arrays.asList("K", "P"));
        stateCityMapping.put("Raja", Arrays.asList("Jai", "Jaise"));
        List<String> states = Arrays.asList("N", "U", "Har", "Raja");

        int randomIndex = faker.random().nextInt(states.size());
        String state = states.get(randomIndex);

        List<String> cities = stateCityMapping.get(state);
        String city = cities.get(faker.random().nextInt(cities.size()));
        stateInput.sendKeys(state);
        stateInput.sendKeys(Keys.TAB);
        cityInput.sendKeys(city);
        cityInput.sendKeys(Keys.TAB);
        return this;

    }
    public StudentPage clickCloseBtn() throws InterruptedException {
        submitBtn.sendKeys(Keys.ESCAPE);
        Thread.sleep(2000);
        return this;
    }
    public StudentPage clickSubmitBtn() throws InterruptedException {
        submitBtn.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        return this;
    }
    }






