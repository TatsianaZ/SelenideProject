package com.it_academy.functional_tests.onliner.enums.onliner;

public enum OnlinerPageUrls {
    HOME_PAGE("https://www.onliner.by/");

    private String url;

    OnlinerPageUrls(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
