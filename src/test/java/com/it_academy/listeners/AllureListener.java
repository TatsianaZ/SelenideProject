package com.it_academy.listeners;

import com.it_academy.utils.ScreenshotUtils;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class AllureListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        ScreenshotUtils.takeScreenshotAndAttachToAllureReport();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ScreenshotUtils.takeScreenshotAndAttachToAllureReport();
    }
}
