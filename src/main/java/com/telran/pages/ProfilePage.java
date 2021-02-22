package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.SQLOutput;

public class ProfilePage extends PageBase {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName-value")
    WebElement user;
    @FindBy(id = "submit")
    WebElement logoutBtn;

    public ProfilePage verifyUserName(String uName) {
        if (user.getText().equalsIgnoreCase(uName)) {
            System.out.println("correct user name: " + user.getText());
        } else {
            System.out.println("incorrect user name " + user.getText());
        }
        return this;
    }

    public LoginPage logout(){
        System.out.println("let's out from profile");
        logoutBtn.click();

        return new LoginPage(driver);
    }


}
