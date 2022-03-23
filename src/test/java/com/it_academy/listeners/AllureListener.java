package com.it_academy.listeners;

import com.codeborne.selenide.Screenshots;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;

public class AllureListener extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult result) {
        try {
            File screenshotAs = Screenshots.takeScreenShotAsFile();
            Allure.addAttachment("Screenshot", FileUtils.openInputStream(screenshotAs));
        } catch (IOException e) {
            System.out.println("Some log is here");
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        try {
            File screenshotAs = Screenshots.takeScreenShotAsFile();
            Allure.addAttachment("Screenshot", FileUtils.openInputStream(screenshotAs));
        } catch (IOException e) {
            System.out.println("Some log is here");
        }
    }
}
