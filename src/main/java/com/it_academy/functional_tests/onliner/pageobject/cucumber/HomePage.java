package com.it_academy.functional_tests.onliner.pageobject.cucumber;

import com.codeborne.selenide.Condition;
import com.it_academy.functional_tests.onliner.pageobject.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static com.it_academy.functional_tests.onliner.enums.cucumber.CucumberPageUrls.HOME_PAGE;
import static java.lang.String.format;

public class HomePage extends BasePage {

    private static final String TEXT_PATTERN = "%s[contains(text(), '%s')]";
    private static final String MENU_SECTION = "//*[contains(@class, 'nav-link')]";
    private static final String CHILD_MENU_ITEM = "//*[contains(@class, 'dropdown')]//*[contains(@class, 'item')]";

    public HomePage navigateToCucumberHomePage() {
        open(HOME_PAGE.getUrl());
        return this;
    }

    public HomePage clickOnMenuItem(String menu) {
        clickOnElementViaJs($x(format(TEXT_PATTERN, MENU_SECTION, menu))
                .shouldBe(Condition.visible, Duration.ofSeconds(60)));
        return this;
    }

    public HomePage clickOnMenuChildItem(String childMenu) {
        clickOnElementViaJs($x(format(format(TEXT_PATTERN, CHILD_MENU_ITEM, childMenu)))
                .shouldBe(Condition.visible, Duration.ofSeconds(10)));
        return this;
    }

    public DocsPage clickOnGherkinSyntaxSubMenuItem() {
        clickOnElementViaJs($x(format(format(TEXT_PATTERN, CHILD_MENU_ITEM, "Gherkin Syntax")))
                .shouldBe(Condition.visible, Duration.ofSeconds(10)));
        return new DocsPage();
    }
}
