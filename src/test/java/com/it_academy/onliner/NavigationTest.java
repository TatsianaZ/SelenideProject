package com.it_academy.onliner;

import com.it_academy.onliner.pageobject.HomePage;
import org.testng.annotations.Test;

public class NavigationTest {

    @Test
    public void testDocsPageNavigation() {
        new HomePage().navigateToCucumberHomePage()
                .clickOnMenuItem("Docs")
                .clickOnGherkinSyntaxSubMenuItem()
                .assertPageWithTitleDisplayed("Gherkin Syntax");
    }
}
