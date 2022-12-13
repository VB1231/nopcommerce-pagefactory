package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    HomePage homePage ;
    LoginPage loginPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups={"sanity","regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(loginPage.getWelcomeText(),"Welcome, Please Sign In!","error login page not displayed");
        loginPage.enterEmailId("Viral@gmail.com");
        loginPage.enterPassword("Welcome");
        loginPage.clickOnLoginButton();
    }
    @Test(groups={"smoke","regression"})
    public void verifyErrorMessageWithInvalidCredential(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("abc3@gmail.com");
        loginPage.enterPassword("Welcome");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"+
                "No customer account found";
        Assert.assertEquals(loginPage.getErrorMessage(),expectedErrorMessage,"Page verify");
    }
}
