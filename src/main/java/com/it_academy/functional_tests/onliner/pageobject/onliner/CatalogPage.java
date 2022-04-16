package com.it_academy.functional_tests.onliner.pageobject.onliner;

import com.it_academy.functional_tests.onliner.pageobject.BasePage;
import io.qameta.allure.Step;

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

    @Step("Click on catalog classifier link {link}")
    public CatalogPage clickOnCatalogClassifierLink(String link) {
        clickOnElementViaJs($x(format(CATALOG_CLASSIFIER_LINK_XPATH_PATTERN, link))
                .shouldBe(visible, Duration.ofSeconds(10)));
        return this;
    }

    @Step("Select category {category}")
    public CatalogPage selectCategory(String category) {
        clickOnElementViaJs($x(format(CATALOG_CLASSIFIER_CATEGORY_XPATH_PATTERN, category))
                .shouldBe(visible, Duration.ofSeconds(10)));
        return this;
    }

    @Step("Select product {product}")
    public ProductPage selectProduct(String product) {
        clickOnElementViaJs($x(format(PRODUCT_LINK_XPATH_PATTERN, product))
                .shouldBe(visible, Duration.ofSeconds(10)));
        return new ProductPage();
    }
}
