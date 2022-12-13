package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterMenuTest extends BaseTest {
    RegisterPage registerPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        registerPage = new RegisterPage();
    }
    @Test(groups = {"sanity","regression"})
    public void UserShouldNavigateToRegisterPageSuccessfully(){
        registerPage.clickOnRegisterPage();
    }
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldRegister(){
        registerPage.fillAllMandatoryField();
    }

}
