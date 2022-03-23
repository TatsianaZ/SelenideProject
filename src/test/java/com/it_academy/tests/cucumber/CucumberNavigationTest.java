package com.it_academy.tests.cucumber;

import com.it_academy.listeners.AllureListener;
import com.it_academy.tests.BaseTest;
import com.it_academy.tests.onliner.pageobject.cucumber.HomePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Listeners(AllureListener.class)
public class CucumberNavigationTest extends BaseTest {

    @Test
    public void testDocsPageNavigation() {
        new HomePage().navigateToCucumberHomePage()
                .clickOnMenuItem("Docs")
                .clickOnGherkinSyntaxSubMenuItem()
                .assertPageWithTitleDisplayed("Gherkin Syntax");
        assertThat(false).isTrue();
    }
}