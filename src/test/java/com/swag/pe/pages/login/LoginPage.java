package com.swag.pe.pages.login;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(id="user-name")
    protected WebElementFacade txt_username;

    @FindBy(id="password")
    protected WebElementFacade txt_password;

    @FindBy(id="login-button")
    protected WebElementFacade btn_login;

}
