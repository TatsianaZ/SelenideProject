package com.it_academy.onliner;

import com.it_academy.onliner.pageobject.HomePage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class NavigationTest {

    @Test
    public void testDocsPageNavigation() {
        new HomePage().navigateToCucumberHomePage()
                .clickOnMenuItem("Docs")
                .clickOnGherkinSyntaxSubMenuItem()
                .assertPageWithTitleDisplayed("Gherkin Syntax");
    }

    @Test
    public void testOnlinerNavigation() {
        open("https://www.onliner.by/");
    }
}
