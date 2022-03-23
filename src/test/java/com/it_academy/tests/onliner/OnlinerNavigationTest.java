package com.it_academy.tests.onliner;

import com.it_academy.tests.BaseTest;
import com.it_academy.tests.onliner.pageobject.onliner.HomePage;
import com.it_academy.tests.onliner.pageobject.onliner.OnlinerHeader;
import org.testng.annotations.Test;

public class OnlinerNavigationTest extends BaseTest {

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
