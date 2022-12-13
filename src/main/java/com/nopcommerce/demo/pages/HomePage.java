package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @CacheLookup
    @FindBy(id = "small-searchterms")
    WebElement searchField;
    @CacheLookup
    @FindBy(className = "header-menu")
    WebElement topMenu;

    public void clickOnLoginLink() {
        Reporter.log("click on login link"+loginLink.toString());
        CustomListeners.test.log(Status.PASS,"click on login" +loginLink);
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        Reporter.log("click on register link"+registerLink.toString());
        CustomListeners.test.log(Status.PASS,"click on registerlink Page" +registerLink);
        clickOnElement(registerLink);
    }

    public void enterTextToSearchField(String product) {
        Reporter.log("verify search text"+product.toString());
        CustomListeners.test.log(Status.PASS,"click on product" +product);
        sendTextToElement(searchField, product);
    }
}
