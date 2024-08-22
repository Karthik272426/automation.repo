package com.pages;

import base.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.testng.*;

public class Order_Confirmation_Page extends BasePage {
    public Order_Confirmation_Page(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement pageTitle;

    @FindBy(xpath = "//h2[text()='Thank you for your order!']")
    private WebElement orderConfirmationMsg;

    public Order_Confirmation_Page verifyPageTitle(){
        Logger.info("User Only See The Order Confirmation Message");
        String actualHeader = pageTitle.getText();
        Assert.assertEquals(actualHeader,"Checkout: Complete!","Header Mismatched");
        return this;
    }

    public Order_Confirmation_Page verifyOrderConfirmation(){
        String actualOrderConfirmationMsg = orderConfirmationMsg.getText();
        Assert.assertEquals(actualOrderConfirmationMsg,"Thank you for your order!","OrderConfirmationMessageInvalid");
        return this;
    }
}
