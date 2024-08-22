package com.pages;

import base.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class Product_Page extends BasePage {

    public Product_Page(WebDriver driver) {
      super(driver);
    }

    public void ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[text()='Products']")
    private WebElement productHeader;

    @FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
    private WebElement product;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement btnAddtoCart;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement btnGoToCart;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement btnCheckOut;

    @FindBy(xpath = " //span[text()='Your Cart']")
    private WebElement cartHeader;

    public Product_Page verifyHeader() {
        if (productHeader.isDisplayed()) {
            System.out.println("Header is displayed.");
        } else {
            System.out.println("Header is not displayed.");
        }
        return this;
    }

    public Product_Page addProduct(){
        btnAddtoCart.click();
        return this;
    }

    public Product_Page goToCart() {
        btnGoToCart.click();
        return this;
    }

    public Product_Page verifyCartHeaderAndContinue() {
        String titleCartHeader = cartHeader.getText();
        System.out.println("Cart Header: " + titleCartHeader);
        return this;
    }

    public Product_Page verifyProduct() {
        if (product.isDisplayed()) {
            System.out.println("Product is matched");
        } else {
            System.out.println("Product Mismatched");
        }
        return this;
    }

    public Product_Page clickCheckOut() {
        btnCheckOut.click();
        return this;
    }
}
