package com.it_academy.tests.functional_tests.onliner;

import com.it_academy.functional_tests.onliner.pageobject.onliner.HomePage;
import com.it_academy.functional_tests.onliner.pageobject.onliner.OnlinerHeader;
import com.it_academy.tests.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerNavigationTest extends BaseTest {
    private HomePage homePage;
    private OnlinerHeader onlinerHeader;

    @BeforeClass
    public void onlinerHomePageNavigation() {
        homePage = new HomePage();
        onlinerHeader = new OnlinerHeader();
        homePage.navigateToOnlinerHomePage();
    }

    @Test
    @Description("test the user is able to navigate to Product Page via Catalog")
    public void testUserIsAbleToNavigateToProductPageViaCatalog() {
        System.out.println("Test 1");
        onlinerHeader
                .clickOnCatalogNavigationLink()
                .clickOnCatalogClassifierLink("Электроника")
                .selectCategory("Аудиотехника")
                .selectProduct("Наушники")
                .assertProductPageTitleIsDisplayed();
    }

    @Test
    @Description("test the user is able to navigate to Catalog Page by link")
    public void testUserIsAbleToNavigateToCatalogPageByLink() {
        System.out.println("Test 2");
        onlinerHeader
                .clickOnCatalogNavigationLink();
    }

    @Test
    @Description("test the user is able to navigate to Catalog Classifier")
    public void testUserIsAbleToNavigateToCatalogClassifier() {
        System.out.println("Test 3");
        onlinerHeader
                .clickOnCatalogNavigationLink()
                .clickOnCatalogClassifierLink("Электроника");
    }
}
