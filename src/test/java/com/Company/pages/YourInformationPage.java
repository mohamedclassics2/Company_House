package com.Company.pages;

import com.Company.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformationPage {
    public YourInformationPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "first-name")
    public WebElement firstName;

    @FindBy(id = "last-name")
    public WebElement lastName;

    @FindBy(id = "postal-code")
    public WebElement postcode;

    @FindBy(xpath = "//input[@value='CONTINUE']")
    public WebElement continueButton;
}
