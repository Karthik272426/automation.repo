package com.pages;

import base.BasePage;
import com.utils.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.testng.*;

public class Shipping_Details_Page extends BasePage {
    public Shipping_Details_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".title")
    private WebElement shippingDetailsHeader;

    @FindBy(id = "first-name")
    private WebElement txtFirstName;

    @FindBy(id = "last-name")
    private WebElement txtLastName;

    @FindBy(id = "postal-code")
    private WebElement txtZipcode;

    @FindBy(xpath  = "//input[@class='submit-button btn btn_primary cart_button btn_action']")
    private WebElement btnContinue;

    @FindBy(xpath  = "//button[text()='Finish']")
    private WebElement btnFinish;

    @FindBy(css = "span[class='title']")
    private WebElement checkoutTitle;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement getBtnFinish;


    public Shipping_Details_Page verifyShippingPageHeader(){
        String actualHeader = shippingDetailsHeader.getText();
        Assert.assertEquals(actualHeader,"Checkout: Your Information","Header is Mismatched");
        return this;
    }

    public Shipping_Details_Page firstName(String FirstName){
        Logger.info("User is on the Shipping Information page");
        txtFirstName.sendKeys(FirstName);
        return this;
    }

    public Shipping_Details_Page lastName(String LastName){
        txtLastName.sendKeys(LastName);
        return this;
    }

    public Shipping_Details_Page zipCode(String Zipcode){
        txtZipcode.sendKeys(Constants.ZIPCODE);
        return this;
    }

    public Shipping_Details_Page userEnterShippingDetails(String FirstName, String LastName, String Zipcode){
        firstName(FirstName)
                .lastName(LastName)
                .zipCode(Zipcode);
        return this;
    }

    public Shipping_Details_Page clickContinueButton(){
        btnContinue.click();
        return this;
    }

    public Shipping_Details_Page verifyCheckoutTitle(){
        Logger.info("User is on the CheckOutPage");
        String actualTitle = checkoutTitle.getText();
        Assert.assertEquals(actualTitle,"Checkout: Overview","Title for Checkout Page is Mismatched");
        return this;
    }

    public Shipping_Details_Page clickFinishButton(){
        btnFinish.click();
        return this;
    }
}
