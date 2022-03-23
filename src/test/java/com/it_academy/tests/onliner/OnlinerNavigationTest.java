package com.it_academy.tests.onliner;

import com.it_academy.listeners.AllureListener;
import com.it_academy.tests.BaseTest;
import com.it_academy.tests.onliner.pageobject.onliner.HomePage;
import com.it_academy.tests.onliner.pageobject.onliner.OnlinerHeader;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
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
