package com.fall2023.ui.listener;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnnotationTransformer implements IRetryAnalyzer {

        private int retryCount = 0;
        private static final int maxretryCount = 3; // Set the max retry count

        @Override
        public boolean retry(ITestResult iTestResult) {
            if (retryCount < maxretryCount){
                retryCount++;
                return true; // Retry the test
            }
            return false;   // No more retries
        }
    }

