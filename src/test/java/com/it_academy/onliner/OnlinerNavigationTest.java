package com.it_academy.onliner;

import com.it_academy.onliner.pageobject.onliner.HomePage;
import com.it_academy.onliner.pageobject.onliner.OnlinerHeader;
import org.testng.annotations.Test;

public class OnlinerNavigationTest {

    @Test
    public void testUserIsAbleToNavigateToProductPageViaCatalog() {
        new HomePage().navigateToOnlinerHomePage();
        new OnlinerHeader()
                .clickOnCatalogNavigationLink()
                .clickOnCatalogClassifierLink("Электроника")
                .selectCategory("Аудиотехника")
                .selectProduct("Наушники")
                .assertProductPageTitleIsDisplayed();
    }
}
