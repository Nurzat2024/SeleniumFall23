package com.fall2023.demousertypes;
import com.fall2023.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoClassTest {
WebDriver driver;
DemoPages demoPages;
    @BeforeClass
    void setUpDriver() {
        driver = Driver.getDriver();
        demoPages = new DemoPages();
    }
@Test
    void addUserTypeTest() throws InterruptedException {
    driver.get("https://znurzat.talentlms.com/dashboard/index/role:administrator");
    Thread.sleep(30000);
      demoPages.clickAddUserType()//на главной странице add User Type
               .fillUpNameInput();//Nurzat
                Thread.sleep(2000);
      demoPages.arrowClick();//галочку нажимаем там должен выйти Administrator,Instructor,Learner

    String actualArrowClick1 =driver .findElement(By.xpath("//span[normalize-space()='Administrator']")).getText();
    Assert.assertEquals(actualArrowClick1, "Administrator");

    String actualArrowClick2=driver .findElement(By.xpath("//span[normalize-space()='Instructor']")).getText();
    Assert.assertEquals(actualArrowClick2, "Instructor");

    String actualArrowClick3=driver .findElement(By.xpath("//span[normalize-space()='Learner']")).getText();
    Assert.assertEquals(actualArrowClick3, "Learner");

//    String actualFillUpNameInput=driver .findElement(By.xpath("//*[@id='user-type-name-help-block']/span")).getText();
//    Assert.assertEquals(actualFillUpNameInput, "This is not a valid 'Name'");



       demoPages.adminClick();      //выбираем Administrator
//       demoPages.instructorClick();  //выбираем Instructor
//       demoPages.learnerClick();      //выбираем Learner
       Thread.sleep(2000);
       demoPages
               .tickTheBoxForAdministrator()//
//               .tickTheBoxForInstructor()   //
//               .tickTheBoxForLearner()      //
//               .tickTheBoxForGeneral()      //
               .clickOnTheAdminButton()
//               .clickOnTheInstructorButton()
//               .clickOnTheLearnButton()
//               .clickOnTheGeneralButton()
               .saveButton()
               .clickAddUserType()
               .fillUpNameInput();
//               .tickTheBoxForInstructor()




}



}
