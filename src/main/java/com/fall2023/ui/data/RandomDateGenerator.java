package com.fall2023.ui.data;

import com.fall2023.ui.drivers.Driver;
import com.fall2023.ui.helper.AlertHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class RandomDateGenerator {
    public static void main(String[] args) {
        RandomDateGenerator obj = new RandomDateGenerator();
        String randomDate = obj.generateRandomDate();
        System.out.println("Random Date: " + randomDate);
    }

    public String generateRandomDate() {
        // Random day (1-28)
        int day = getRandomNumberInRange(1, 28);

        // Random month (1-12)
        int month = getRandomNumberInRange(1, 12);

        // Random year (e.g., between 1900 and 2023)
        int year = getRandomNumberInRange(1900, 2023);

        // Ensure the generated date is valid
        if (month == 2 && day > 28) {
            day = 28; // Limit February to 28 days
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            day = 30; // Limit April, June, September, November to 30 days
        }

        // Format the date string-Форматирование строки даты
        String dateString = String.format("%02d/%02d/%d", day, month, year);
        return dateString;
    }

    public static int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }


//    @Test
//    void demo() throws InterruptedException {
//        RandomDateGenerator obj1 = new RandomDateGenerator();
//        WebDriver driver = Driver.getDriver();
//        driver.get("https://demoqa.com/automation-practice-form");
//        WebElement confirmButton = driver.findElement(By.id("dateOfBirthInput"));
//        confirmButton.clear();
////        String formattedBirthday = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH.ENGLISH).format(generateRandomDate());
//        confirmButton.sendKeys(generateRandomDate());
//
//
//        Thread.sleep(6000);
@Test
void demo() throws InterruptedException {
    WebDriver driver = Driver.getDriver();
    driver.get("https://demoqa.com/automation-practice-form");
    WebElement confirmButton = driver.findElement(By.id("dateOfBirthInput"));
    String formattedBirthday = generateRandomDate();
    confirmButton.sendKeys(formattedBirthday);


    Thread.sleep(6000);
}
}




