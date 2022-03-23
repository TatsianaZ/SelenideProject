package com.it_academy.onliner.pageobject;

import com.codeborne.selenide.Condition;
import com.it_academy.onliner.framework.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.String.format;

public class HomePage extends BasePage {
    private static final String CUCUMBER_URL = "https://cucumber.io/";

    private static final String TEXT_PATTERN = "%s[contains(text(), '%s')]";
    private static final String MENU_SECTION = "//*[contains(@class, 'nav-link')]";
    private static final String CHILD_MENU_ITEM = "//*[contains(@class, 'dropdown')]//*[contains(@class, 'item')]";

    public HomePage navigateToCucumberHomePage() {
        open(CUCUMBER_URL);
        return this;
    }

    public HomePage clickOnMenuItem(String menu) {
        $x(format(TEXT_PATTERN, MENU_SECTION, menu))
                .shouldBe(Condition.visible, Duration.ofSeconds(10))
                .click();
        return this;
    }

    public HomePage clickOnMenuChildItem(String childMenu) {
        $x(format(format(TEXT_PATTERN, CHILD_MENU_ITEM, childMenu)))
                .shouldBe(Condition.visible, Duration.ofSeconds(10))
                .click();
        return this;
    }

    public DocsPage clickOnGherkinSyntaxSubMenuItem() {
        $x(format(format(TEXT_PATTERN, CHILD_MENU_ITEM, "Gherkin Syntax")))
                .shouldBe(Condition.visible, Duration.ofSeconds(10))
                .click();
        return new DocsPage();
    }

}
