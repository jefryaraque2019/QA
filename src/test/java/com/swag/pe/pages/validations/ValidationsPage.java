package com.swag.pe.pages.validations;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ValidationsPage extends PageObject {

    @FindBy(xpath = "//span[@class='title']")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//h3[@data-test='error' and text()='Epic sadface: Username and password do not match any user in this service']")
    protected WebElementFacade lbl_errorMessage;

    @FindBy(xpath = "//div[@class='cart_quantity']")
    private List<WebElementFacade> productsList;

    public List<WebElementFacade> getProductsList() {
        return productsList;
    }


}
