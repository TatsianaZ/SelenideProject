package com.it_academy.tests.onliner.pageobject.onliner;

import com.codeborne.selenide.SelenideElement;
import com.it_academy.tests.onliner.pageobject.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ProductPage extends BasePage {
    private static final SelenideElement productPageTitle =
            $x("//h1[contains(@class, ' js-schema-header_title')]");

    public ProductPage assertProductPageTitleIsDisplayed() {
        productPageTitle.shouldBe(visible, Duration.ofSeconds(10));
        return this;
    }
}
