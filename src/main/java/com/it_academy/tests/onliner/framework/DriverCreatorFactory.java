package com.it_academy.tests.onliner.framework;

public final class DriverCreatorFactory {

    private DriverCreatorFactory() {
    }

    public static WebDriverCreator getDriverCreator(String driverType) {
        switch (driverType) {
            case "firefox":
                return null;
            default:
                return new ChromeDriverCreator();
        }
    }
}
