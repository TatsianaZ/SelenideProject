package com.it_academy.functional_tests.onliner.pageobject.onliner;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.it_academy.functional_tests.onliner.pageobject.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.it_academy.functional_tests.onliner.enums.onliner.OnlinerPageUrls.HOME_PAGE;
import static java.time.Duration.ofSeconds;

public class HomePage extends BasePage {
    private static final SelenideElement tilesOuterComponent =
            $x("//*[contains(@class, 'b-tiles-outer')]");
    private static final SelenideElement catalogLink =
            $x("//a[contains(@href, 'catalog.onliner.by')]");
    private static final SelenideElement catalogSuperPriceLink =
            $x("//*[contains(@class, 'main-page-catalog-layer')]//a[contains(@href, 'superprice')]");
    private final ElementsCollection elements = $$x("");

    public HomePage navigateToOnlinerHomePage() {
        open(HOME_PAGE.getUrl());
        return this;
    }

    public HomePage assertTilesOuterComponentIsVisible() {
        tilesOuterComponent.shouldBe(visible, ofSeconds(10));
        return this;
    }

    public CatalogPage clickOnCatalogLink() {
        clickOnElementViaJs(catalogLink.shouldBe(visible, ofSeconds(10)));
        return new CatalogPage();
    }
}
