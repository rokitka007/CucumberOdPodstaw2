package com.company;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BasePage {

    public WebDriver driver;

    public BasePage(){
        this.driver = Setup.setDriver();
    }
}
