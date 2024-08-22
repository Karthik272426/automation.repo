package com.pages;

import base.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class Login_Page extends BasePage {

    public Login_Page(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "user-name")
    private WebElement txtUsername;

    @FindBy(id = "password")
    private WebElement txtPassword;

    @FindBy(id = "login-button")
    private WebElement btnLogin;

    public Login_Page enterUsername(String username) {
        txtUsername.sendKeys(username);
        return this;
    }

    public Login_Page enterPassword(String password) {
        txtPassword.sendKeys(password);
        return this;
    }

    public Login_Page clickLogin() {
        btnLogin.click();
        return this;
    }

    public Login_Page login(String username, String password) throws Exception {
        enterUsername(username)
                .enterPassword(password)
                .clickLogin();
        return this;
    }

}
