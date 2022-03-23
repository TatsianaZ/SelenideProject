package com.it_academy.tests.onliner.pageobject.onliner;

import com.codeborne.selenide.SelenideElement;
import com.it_academy.tests.onliner.pageobject.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static com.it_academy.tests.onliner.enums.onliner.OnlinerPageUrls.HOME_PAGE;

public class HomePage extends BasePage {
    private static final SelenideElement tilesOuterComponent =
            $x("//*[contains(@class, 'b-tiles-outer')]");
    private static final SelenideElement catalogLink =
            $x("//a[contains(@href, 'catalog.onliner.by')]");
    private static final SelenideElement catalogSuperPriceLink =
            $x("//*[contains(@class, 'main-page-catalog-layer')]//a[contains(@href, 'superprice')]");

    public HomePage navigateToOnlinerHomePage() {
        open(HOME_PAGE.getUrl());
        return this;
    }

    public HomePage assertTilesOuterComponentIsVisible() {
        tilesOuterComponent.shouldBe(visible, Duration.ofSeconds(10));
        return this;
    }

    public CatalogPage clickOnCatalogLink() {
        clickOnElementViaJs(catalogLink.shouldBe(visible, Duration.ofSeconds(10)));
        return new CatalogPage();
    }
}
