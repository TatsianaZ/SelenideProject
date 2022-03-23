package com.it_academy.onliner.pageobject.onliner;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.it_academy.onliner.framework.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class ProductPage extends BasePage {
    private static final SelenideElement productPageTitle =
            $x("//h1[contains(@class, ' js-schema-header_title')]");

    public ProductPage assertProductPageTitleIsDisplayed() {
        productPageTitle.shouldBe(Condition.visible, Duration.ofSeconds(10));
        return this;
    }
}
