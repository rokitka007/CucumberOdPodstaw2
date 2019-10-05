package com.company;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Setup {
    private static final String FIREFOX_PATH = "test/resources/geckodriver.exe";

    @Before
    public static WebDriver setDriver() {
        System.setProperty("webdriver.gecko.driver", FIREFOX_PATH);
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("start-maximized");
        FirefoxDriver driver = new FirefoxDriver(options);
        return driver;
    }
}
