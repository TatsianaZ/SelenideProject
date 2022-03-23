package com.it_academy.tests.onliner.pageobject.cucumber;

import com.codeborne.selenide.Condition;
import com.it_academy.tests.onliner.framework.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class DocsPage extends BasePage {
    private static final String PAGE_TITLE_PATTERN =
            "//*[@class='page-header']/*[contains(@class, 'title') and contains(text(), '%s')]";

    public void assertPageWithTitleDisplayed(String title) {
        $x(format(PAGE_TITLE_PATTERN, title))
                .shouldBe(Condition.visible, Duration.ofSeconds(10));
    }
}
