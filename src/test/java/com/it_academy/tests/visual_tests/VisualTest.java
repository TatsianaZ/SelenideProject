package com.it_academy.tests.visual_tests;

import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.Eyes;
import com.it_academy.functional_tests.onliner.pageobject.applitools.HelloWorldPage;
import com.it_academy.tests.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class VisualTest extends BaseTest {
    private static final String API_KEY = "BXbNV3TdxDOVrAo97987xiW1034105DUOgfwSUOVO879ucXow110";
    private HelloWorldPage helloWorldPage;
    private String testName;
    private Eyes eyes;

    @BeforeClass
    public void init() {
        helloWorldPage = new HelloWorldPage();
    }

    @BeforeMethod
    public void handleTestMethodName(Method method) {
        testName = method.getName();
        eyes = new Eyes();
        eyes.setApiKey(API_KEY);
        eyes.setMatchLevel(MatchLevel.STRICT);
    }

    @Test
    public void testExample() {
        eyes.open(getWebDriver(),
                "Applitools Eyes",
                testName);
        helloWorldPage.navigateToHelloWorldPage();
        eyes.checkWindow("Home Page");
    }

    @AfterMethod
    public void closeEyes() {
        eyes.close();
    }

}

