package com.it_academy.onliner.pageobject.onliner;

import com.it_academy.onliner.framework.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class CatalogPage extends BasePage {
    private static final String CATALOG_CLASSIFIER_LINK_XPATH_PATTERN =
            "//*[contains(@class, 'catalog-navigation-classifier__item')]//*[contains(text(), '%s')]";
    private static final String CATALOG_CLASSIFIER_CATEGORY_XPATH_PATTERN =
            "//*[@class='catalog-navigation-list__aside-title' and contains(text(), '%s')]";
    private static final String PRODUCT_LINK_XPATH_PATTERN =
            "//*[contains(@class, 'item_active')]//a[.//*[contains(text(), '%s')]]";

    public CatalogPage clickOnCatalogClassifierLink(String link) {
        $x(format(CATALOG_CLASSIFIER_LINK_XPATH_PATTERN, link))
                .shouldBe(visible, Duration.ofSeconds(10))
                .scrollIntoView(true)
                .click();
        return this;
    }

    public CatalogPage selectCategory(String category) {
        $x(format(CATALOG_CLASSIFIER_CATEGORY_XPATH_PATTERN, category))
                .shouldBe(visible, Duration.ofSeconds(10))
                .scrollIntoView(true)
                .click();
        return this;
    }

    public ProductPage selectProduct(String product) {
        $x(format(PRODUCT_LINK_XPATH_PATTERN, product))
                .shouldBe(visible, Duration.ofSeconds(10))
                .scrollIntoView(true)
                .click();
        return new ProductPage();
    }
}
