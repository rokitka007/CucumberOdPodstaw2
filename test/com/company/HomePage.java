package com.company;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    private final String HOME_PAGE_URL = "https://www.booking.com";


    @FindBy(className = "sb-destination__input")
    private WebElement destinationInput;

    @FindBy(xpath = "//li[contains(@class, 'sb-autocomplete__item')]")
    private WebElement destinationItem;

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
        System.out.println(destinationInput.getText());
        if(destinationInput.getText().equals(location))
            System.out.println("Input jest uzupelniony");
        else
            throw new Exception("Input nie zostal uzupełniony");
    }

    public String chooseElement(){
        this.wait.until(ExpectedConditions.visibilityOf(destinationItem));
        String chosenElement = destinationItem.getText();
        destinationItem.click();
        return chosenElement;
    }
}
