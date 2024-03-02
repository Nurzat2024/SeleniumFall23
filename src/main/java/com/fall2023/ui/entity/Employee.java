package com.fall2023.ui.entity;


import lombok.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor //конструктор со всеми свойствами
@NoArgsConstructor  //конструктор по умолчанию
@Getter//получит
@Setter// изменять
@EqualsAndHashCode
@ToString
public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private int salary;
    private String department;

   public static ArrayList<Employee> getEmployeeFromTable(WebDriver driver) { //getEmployeeFromTable-возьми всех сотрудников с таблицы
                                    // Найти строки таблицы
        List<WebElement> rows = driver.findElements(By.cssSelector(".ReactTable .rt-tr-group"));
        ArrayList<Employee> employees = new ArrayList<>();

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            //     первая имя
            String firstName = cells.get(0).getText();
            String lastName = cells.get(1).getText();
            String ageText = cells.get(2).getText().replaceAll("[^0-9]","");//заменили на пустое
            String email = cells.get(3).getText();
            String salaryText = cells.get(4).getText().replaceAll("[^0-9]","");//заменили на пустое
            String department = cells.get(5).getText();

            //если какое нибудь поле пустое то не добавляй
            if(firstName.isEmpty() || lastName.isEmpty() || ageText.isEmpty() || email.isEmpty() || salaryText.isEmpty() || department.isEmpty()){
               continue;//останови
            }
            int age = Integer.parseInt(ageText.trim());//запарсили "ageText" = на интежер
            int salary = Integer.parseInt(salaryText.trim());//запарсили "salaryText" = на интежер

            employees.add(new Employee(firstName, lastName, age, email, salary, department));
        }
        return employees;
    }
}

