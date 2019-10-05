package com.company;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps(){
        this.homePage = new HomePage();
    }

    @Given("^User goes on home page$")
    public void goToHomePage(){ this.homePage.goToHomePage(); }

    @When("User fill input with location \"([^\"]*)\"")
    public void user_fill_input_with_location_Gdansk(String location) {
        this.homePage.fillDestinationInput(location);
    }

    @Then("check location data \"([^\"]*)\"")
    public void check_location_data_Gdansk(String location) {
        try {
            this.homePage.checkDestinationInput(location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
