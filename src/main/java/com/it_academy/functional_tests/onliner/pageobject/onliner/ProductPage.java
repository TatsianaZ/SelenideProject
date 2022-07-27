package com.it_academy.functional_tests.onliner.pageobject.onliner;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.it_academy.functional_tests.onliner.pageobject.BasePage;
import lombok.Getter;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static java.time.Duration.ofSeconds;

public class ProductPage extends BasePage {
    @Getter
    private static final SelenideElement productPageTitle =
            $x("//h1[contains(@class, ' js-schema-header_title')]");

    private static final ElementsCollection elements = $$x("");

    public ProductPage assertProductPageTitleIsDisplayed() {
        productPageTitle.shouldBe(visible, ofSeconds(60));
        return this;
    }

    public void verifyAllHeadingsAreDisplayed() {
        elements.should(CollectionCondition.noneMatch("", el -> el.isDisplayed()), ofSeconds(50));
        elements.shouldHave(CollectionCondition.size(8), ofSeconds(30));
    }
}
