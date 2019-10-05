package com.company;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

    private HomePage homePage;
    private String destination;

    public HomePageSteps(){
        this.homePage = new HomePage();
    }

    @Given("^User goes on home page$")
    public void goToHomePage(){ this.homePage.goToHomePage(); }

    @When("User fill input with location \"([^\"]*)\"")
    public void user_fill_input_with_location_Gdansk(String location) {
        this.homePage.fillDestinationInput(location);
        this.destination = this.homePage.chooseElement();
    }

    @Then("check location data \"([^\"]*)\"")
    public void check_location_data_Gdansk(String location) {
        if(!this.destination.equals("Gdańsk\nPomerania, Poland"))
            try {
                throw new Exception("Chosen element is wrong. It's " + this.destination + " and should be Gdańsk, Pomerania, Poland");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
