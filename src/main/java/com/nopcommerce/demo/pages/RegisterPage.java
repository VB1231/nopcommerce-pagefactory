package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerPage;
    @CacheLookup
    @FindBy(id="gender-male")
    WebElement genderMale;
    @CacheLookup
    @FindBy(id="FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id="LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement birthDay;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement birthMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement birthYear;
    @CacheLookup
    @FindBy(id="Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id="Company")
    WebElement companyField;
    @CacheLookup
    @FindBy(id="Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id="ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(id="register-button")
    WebElement clickRegister;
    public void clickOnRegisterPage() {
        Reporter.log("Click on register page"+registerPage.toString());
        CustomListeners.test.log(Status.PASS,"click on register page" +registerPage);
        clickOnElement(registerPage);
    }

    public void fillAllMandatoryField() {
        Reporter.log("Click on gender"+genderMale.toString());
        CustomListeners.test.log(Status.PASS,"select gender male" +genderMale);
        clickOnElement(genderMale);
        Reporter.log("enter first name"+firstName.toString());
        CustomListeners.test.log(Status.PASS,"enter first name" +firstName);
        sendTextToElement(firstName, "viral");
        Reporter.log("enter last Name"+lastName.toString());
        CustomListeners.test.log(Status.PASS,"enter last name" +lastName);
        sendTextToElement(lastName, "Brahm");
        Reporter.log("select birth day"+birthDay.toString());
        CustomListeners.test.log(Status.PASS,"select birth day" +birthDay);
        selectByIndexFromDropDown(birthDay, 3);
        Reporter.log("select birth month"+birthMonth.toString());
        CustomListeners.test.log(Status.PASS,"select birth month" +birthMonth);
        selectByIndexFromDropDown(birthMonth, 3);
        Reporter.log("select birth Year"+birthYear.toString());
        CustomListeners.test.log(Status.PASS,"select birth year" +birthYear);
        selectByIndexFromDropDown(birthYear, 6);
        Reporter.log("enter email id"+emailField.toString());
        CustomListeners.test.log(Status.PASS,"enter email" +emailField);
        sendTextToElement(emailField, randomEmail());
        Reporter.log("enter company name"+companyField.toString());
        CustomListeners.test.log(Status.PASS,"enter company name" +companyField);
        sendTextToElement(companyField, "Prime Testing");
        Reporter.log("enter password"+passwordField.toString());
        CustomListeners.test.log(Status.PASS,"enter password filed" +passwordField);
        sendTextToElement(passwordField, "Welcome123");
        Reporter.log("enter confirm password"+confirmPassword.toString());
        CustomListeners.test.log(Status.PASS,"enter confirm password" +confirmPassword);
        sendTextToElement(confirmPassword, "Welcome123");
        Reporter.log("click on register link"+clickRegister.toString());
        CustomListeners.test.log(Status.PASS,"click on register" +clickRegister);
        clickOnElement(clickRegister);
    }
}
