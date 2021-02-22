package com.telran.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    WebElement username;
    @FindBy(id = "password")
    WebElement pswd;
    @FindBy(id = "login")
    WebElement loginBtn;

    public ProfilePage login(String userName, String paswd) {
        type(username, userName);
        type(pswd, paswd);
        loginBtn.click();
        return new ProfilePage(driver);
    }

    public LoginPage loginNegative(String userName, String paswd) {
        type(username, userName);
        type(pswd, paswd);
        loginBtn.click();
        return this;
    }

}
