package com.it_academy.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void setUp() {
        SelenideLogger
                .addListener("AllureSelenide",
                        new AllureSelenide().screenshots(true).savePageSource(true));
    }
}
