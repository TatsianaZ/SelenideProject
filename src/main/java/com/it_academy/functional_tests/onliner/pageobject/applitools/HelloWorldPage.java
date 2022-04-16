package com.it_academy.functional_tests.onliner.pageobject.applitools;

import com.it_academy.functional_tests.onliner.pageobject.BasePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.open;

public class HelloWorldPage extends BasePage {
    protected static final Logger LOG = LoggerFactory.getLogger(HelloWorldPage.class);

    public HelloWorldPage navigateToHelloWorldPage() {
        LOG.info("Hiiiiiiiiiii");
        open("https://applitools.com/helloworld/?diff2");
        //open("https://applitools.com/helloworld");
        return this;
    }
}
