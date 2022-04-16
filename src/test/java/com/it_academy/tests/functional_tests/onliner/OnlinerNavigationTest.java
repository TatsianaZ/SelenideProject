package com.it_academy.tests.functional_tests.onliner;

import com.it_academy.tests.BaseTest;
import com.it_academy.functional_tests.onliner.pageobject.onliner.HomePage;
import com.it_academy.functional_tests.onliner.pageobject.onliner.OnlinerHeader;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class OnlinerNavigationTest extends BaseTest {

    @Test
    @Description("test the user is able to navigate to Product Page via Catalog")
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
