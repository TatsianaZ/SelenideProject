package com.it_academy.tests.onliner.enums.cucumber;

public enum CucumberPageUrls {
    HOME_PAGE("https://cucumber.io/");

    private String url;

    CucumberPageUrls(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
