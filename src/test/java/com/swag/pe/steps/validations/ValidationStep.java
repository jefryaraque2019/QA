package com.swag.pe.steps.validations;

import com.swag.pe.pages.validations.ValidationsPage;
import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.WebElementFacade;

public class ValidationStep {

    ValidationsPage validationsPage;

    @Step
    public Boolean titleIsVisible() {
        return validationsPage.getDriver()
                .findElement(org.openqa.selenium.By.xpath("//span[@class='title']"))
                .isDisplayed();
    }

    @Step
    public Boolean errorMessageIsDisplayed() {
        return validationsPage.getDriver()
                .findElement(org.openqa.selenium.By.xpath("//h3[@data-test='error']"))
                .isDisplayed();
    }

    @Step("Validar los productos listados en el carrito")
    public Boolean productsAreDisplayed(){
        for (WebElementFacade product : validationsPage.getProductsList())
        {
            if (product.isDisplayed()){
                return true;
            }
        }
        return false;
    }

    @Step("Validar que el carrito este vacio de productos")
    public Boolean shoppingCartIsEmpty(){
        for (WebElementFacade product: validationsPage.getProductsList()){
            if (!product.isDisplayed()){
                return false;
            }
        }
        return true;
    }
}