package com.company;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "test/resources/com/company/HomePage.feature",
        plugin = {"pretty",
                "json:target/cucumber_json_reports/home-page.json",
                "html:target/home-page-html"})
public class HomePageTest {
}
