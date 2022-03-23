package com.it_academy.onliner.pageobject.onliner;

import com.it_academy.onliner.framework.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class OnlinerHeader extends BasePage {
    private static final String MAIN_NAVIGATION_LINK_XPATH_PATTERN =
            "//*[contains(@class, 'main-navigation__text') and contains(text(), '%s')]";

    public void clickOnMainNavigationLink(String link) {
        $x(format(MAIN_NAVIGATION_LINK_XPATH_PATTERN, link))
                .shouldBe(visible, Duration.ofSeconds(10))
                .scrollIntoView(true)
                .click();
    }

    public CatalogPage clickOnCatalogNavigationLink() {
        clickOnMainNavigationLink("Каталог");
        return new CatalogPage();
    }
}
