package com.swag.pe.steps.login;

import com.swag.pe.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;

public class LoginStep {

    LoginPage loginPage;

    @Step
    public void typeUsername(String username){
        loginPage.getDriver().findElement(org.openqa.selenium.By.id("user-name"))
                .sendKeys(username);
    }

    @Step
    public void typePassword(String password){
        loginPage.getDriver().findElement(org.openqa.selenium.By.id("password"))
                .sendKeys(password);
    }

    @Step
    public void clickLogin(){
        loginPage.getDriver().findElement(org.openqa.selenium.By.id("login-button"))
                .click();
    }
}