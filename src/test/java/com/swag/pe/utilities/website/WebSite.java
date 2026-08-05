package com.swag.pe.utilities.website;

import com.swag.pe.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;

public class WebSite {

    @Steps(shared = true)
    LoginPage loginPage;

    @Step("Navegar al sitio web")
    public void navigateTo(String url){
        loginPage.setDefaultBaseUrl(url);
        loginPage.open();
    }
}