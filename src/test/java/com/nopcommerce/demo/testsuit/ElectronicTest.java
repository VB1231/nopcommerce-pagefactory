package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.ElectronicPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElectronicTest extends BaseTest {
    ElectronicPage electronicPage;
    ComputerPage computerPage;
    RegisterPage registerPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        electronicPage = new ElectronicPage();
        registerPage = new RegisterPage();
        computerPage = new ComputerPage();

    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        electronicPage.electronicToCellPhone();
        Assert.assertEquals(electronicPage.verifyTextCellPhone(),"Cell phones","Not verify");
    }
    @Test(groups = {"smoke","regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()throws StaleElementReferenceException,InterruptedException {
        verifyUserShouldNavigateToCellPhonesPageSuccessfully();
        electronicPage.clickOnList();
        Thread.sleep(700);
        electronicPage.clickOnNokiaLumia();
        Assert.assertEquals(electronicPage.verifyTextNokiaLumia(),"Nokia Lumia 1020","Not verify");
        Assert.assertEquals(electronicPage.verifyPrice(),"$349.00","Not verify");
        electronicPage.changeQty("2");
        Assert.assertEquals(electronicPage.verifyTotalChangePrice(),"$698.00","Not verify");
        electronicPage.acceptTermsAndClick();
        Assert.assertEquals(electronicPage.verifyWelcomeSignIn(),"Welcome, Please Sign In!","Not verify");
        electronicPage.clickOnRegister();
        registerPage.fillAllMandatoryField();
        Assert.assertEquals(electronicPage.verifyRegisterComplete(),"Your registration completed","Not Verify");
        electronicPage.clickOnContinueAfterRegisterComplete();
        Assert.assertEquals(electronicPage.verifyShoppingCartAfterContinue(),"Shopping cart","Not verify");
        electronicPage.clickOnTermsAccept();
        computerPage.fillAllMandatoryField();
        electronicPage.selectShipmentType();
        electronicPage.selectPaymentMethod();
        computerPage.fillCardDetail("Visa");
        Assert.assertEquals(computerPage.verifyPaymentMethod(),"Credit Card","Not verify");
        Assert.assertEquals(electronicPage.verifyShippingMethod(),"2nd Day Air","Not verify");
        Assert.assertEquals(electronicPage.VerifyShippingTotal(),"$698.00","Not verify");
        computerPage.clickOnConfirm();
        Assert.assertEquals(computerPage.verifyThankYou(),"Thank you","Not verify");
        Assert.assertEquals(computerPage.VerifyYourOrderConfirm(),"Your order has been successfully processed!","Not verify");
        computerPage.clickCompleteConfirm();
        Assert.assertEquals(computerPage.verifyWelcomeToStore(),"Welcome to our store","Not verify");
        electronicPage.clickOnLogOut();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/","Not verify");



    }
}
