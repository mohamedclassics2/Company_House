package com.Company.pages;

import com.Company.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {
    public YourCartPage () {
        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(xpath = "//a[@class='btn_action checkout_button']")
    public WebElement checkout;
}
