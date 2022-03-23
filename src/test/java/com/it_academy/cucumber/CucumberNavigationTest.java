package com.it_academy.cucumber;

import com.it_academy.onliner.pageobject.cucumber.HomePage;
import org.testng.annotations.Test;

public class CucumberNavigationTest {

    @Test
    public void testDocsPageNavigation() {
        new HomePage().navigateToCucumberHomePage()
                .clickOnMenuItem("Docs")
                .clickOnGherkinSyntaxSubMenuItem()
                .assertPageWithTitleDisplayed("Gherkin Syntax");
    }
}
