package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;


    public String getWelcomeText() {
        Reporter.log("verify welcome text"+welcomeText.toString());
        CustomListeners.test.log(Status.PASS,"get welcome text" +welcomeText);
        return getTextFromElement(welcomeText);

    }

    public void enterEmailId(String email) {
        Reporter.log("enter email "+emailField.toString());
        CustomListeners.test.log(Status.PASS,"enter email" +emailField);
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("enter password "+passwordField.toString());
        CustomListeners.test.log(Status.PASS,"enter password" +passwordField);
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("click on login button"+loginButton.toString());
        CustomListeners.test.log(Status.PASS,"click on login button" +loginButton);
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        Reporter.log("verify error message"+errorMessage.toString());
        CustomListeners.test.log(Status.PASS,"get error message" +errorMessage);
        return getTextFromElement(errorMessage);
    }
}
