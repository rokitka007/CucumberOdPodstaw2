package com.company;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    private final String HOME_PAGE_URL = "https://www.booking.com";

    @FindBy(className = "sb-destination__input")
    private WebElement destinationInput;

    public HomePage (){
        PageFactory.initElements(this.driver, this);
    }

    public void goToHomePage(){
        this.driver.get(HOME_PAGE_URL);
    }

    public void fillDestinationInput(String location){
        destinationInput.sendKeys(location);
    }

    public void checkDestinationInput(String location) throws Exception {
        if(destinationInput.getText().equals(location))
            System.out.println("Input jest uzupelniony");
        else
            throw new Exception("Input nie zostal uzupełniony");
    }
}
