package com.swag.pe.steps.validations;

import com.swag.pe.pages.validations.ValidationsPage;
import net.serenitybdd.annotations.Step;

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
}