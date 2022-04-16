package com.it_academy.functional_tests.onliner.pageobject;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.it_academy.functional_tests.onliner.framework.SelenideWebDriverDiscovery;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;

public abstract class BasePage {

    public BasePage() {
        Configuration.browser = SelenideWebDriverDiscovery.class.getName();
        Configuration.pageLoadTimeout = 200000;
        Configuration.startMaximized = true;
        open();
    }

    public void clickOnElementViaJs(SelenideElement element) {
        executeJavaScript("arguments[0].click();", element);
    }
}
