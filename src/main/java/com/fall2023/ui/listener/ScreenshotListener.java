package com.fall2023.ui.listener;
import com.fall2023.ui.drivers.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import io.qameta.allure.Attachment;

    public class ScreenshotListener implements ITestListener {

        WebDriver driver = Driver.getDriver();

        @Override
        public void onTestFailure(ITestResult result) {
            if (driver != null) {
                saveScreenshotPNG();
            }
        }

        @Attachment(value = "Page screenshot", type = "image/png")
        public byte[] saveScreenshotPNG() {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        }

        // Implement other ITestListener methods as needed (leave them empty if not used)
        @Override
        public void onStart(ITestContext context) {
            System.out.println("Hello OnStart");
        }

        @Override
        public void onFinish(ITestContext context) {
            System.out.println("Hello onFinish");
        }
        @Override
        public void onTestStart(ITestResult result) {
            System.out.println("Hello on test start");
        }
        @Override
        public void onTestSuccess(ITestResult result) {
            System.out.println("Hello onTestSuccess");
        }
        @Override
        public void onTestSkipped(ITestResult result) {
        }
        @Override
        public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        }
    }




