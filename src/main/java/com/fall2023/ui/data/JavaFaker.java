package com.fall2023.ui.data;

import com.fall2023.ui.entity.Employee;
import com.github.javafaker.Faker;

public class JavaFaker {

        static Faker faker = new Faker();

        public static Employee createNewEmployeeWithFakeData(){
            Employee employee = new Employee();
            employee.setFirstName(faker.name().firstName());
            employee.setLastName(faker.name().lastName());
            employee.setEmail(faker.internet().emailAddress());
            employee.setAge(faker.number().randomDigit());
            employee.setSalary(faker.number().randomDigit());
            employee.setDepartment(faker.commerce().department());
            return employee;
        }
    }