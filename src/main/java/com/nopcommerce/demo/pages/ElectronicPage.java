package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ElectronicPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Electronics")
    WebElement electronicPage;
    @CacheLookup
    @FindBy(linkText = "Cell phones")
    WebElement cellphonePage;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyTextCellPhone;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement clickOnList;
    @CacheLookup
    @FindBy(linkText = "Nokia Lumia 1020")
    WebElement clickOnNokiaLumia;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement verifyTextNokiaLumia;

    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement verifyPrice;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement qty;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement addToCart ;
    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeMessageBar;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']/strong")
    WebElement priceVerifyText;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverToShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickGoCart;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement acceptTerms;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement Checkout;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcomeSignIn;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement clickOnRegister;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement verifyRegisterComplete;


    @CacheLookup
    @FindBy(xpath = "//div[@class='buttons']/a")
    WebElement clickOnCompleteAfterRegister;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyShoppingCartAfterContinue;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsConditionAccept;
    @CacheLookup
    @FindBy(id = "checkout")
    WebElement clickOnCheckOut;

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement selectRadioAirShip;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement clickContinue1;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement selectPaymentMethod;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentClick;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement clickLogout;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='2nd Day Air']")
    WebElement verifyShippingMethod;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary' and contains(text(),'$698.00')]")
    WebElement verifyShippingTotal;




    public String getStringElectronic() {
        Reporter.log("get text from electronic page"+electronicPage.toString());
        return getTextFromElement(electronicPage);
    }

    public void clickOnElectronic() {
        Reporter.log("click on electronic page"+electronicPage.toString());
        clickOnElement(electronicPage);
    }

    public void electronicToCellPhone() {
        Reporter.log("mouse hover to electronic page"+electronicPage.toString());
        mouseHoverToElement(electronicPage);
        Reporter.log("click on cell phone page"+cellphonePage.toString());
        clickOnElement(cellphonePage);
    }

    public String verifyTextCellPhone() {
        Reporter.log("get text from cell phone"+verifyTextCellPhone.toString());
        return getTextFromElement(verifyTextCellPhone);
    }

    public void clickOnList() {
        Reporter.log("click on list "+clickOnList.toString());
        clickOnElement(clickOnList);
    }

    public void clickOnNokiaLumia() {
        Reporter.log("click o nokia lumia"+clickOnNokiaLumia.toString());
        clickOnElement(clickOnNokiaLumia);
    }

    public String verifyTextNokiaLumia() {
        Reporter.log("verify text nokia lumia"+verifyTextNokiaLumia.toString());
        return getTextFromElement(verifyTextNokiaLumia);
    }

    public String verifyPrice() {
        Reporter.log("get text from electronic page"+electronicPage.toString());
        return getTextFromElement(verifyPrice);
    }

    public void changeQty(String q) {
        qty.clear();
        Reporter.log("update qty"+qty.toString());
       sendTextToElement(qty, q);
        CustomListeners.test.log(Status.PASS,"Enter qty " +qty);
        Reporter.log("click on add to cart"+addToCart.toString());
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS,"click on add to cart " +addToCart);
        Reporter.log("click on close message bar"+closeMessageBar.toString());
        clickOnElement(closeMessageBar);
        CustomListeners.test.log(Status.PASS,"close message bar " +closeMessageBar);
    }

    public String verifyTotalChangePrice() {
        mouseHoverToElement(mouseHoverToShoppingCart);
        Reporter.log("click on go cart"+clickGoCart.toString());
        CustomListeners.test.log(Status.PASS,"click on Goto cart " +clickGoCart);
        clickOnElement(clickGoCart);
        Reporter.log("verify price"+priceVerifyText.toString());
        CustomListeners.test.log(Status.PASS,"verify price " +priceVerifyText);
        return getTextFromElement(priceVerifyText);
    }

    public void acceptTermsAndClick() {
        Reporter.log("accept terms and condition"+acceptTerms.toString());
        CustomListeners.test.log(Status.PASS,"click on accept terms " +acceptTerms);
        clickOnElement(acceptTerms);
        Reporter.log("click on Checkout"+Checkout.toString());
        CustomListeners.test.log(Status.PASS,"click on Checkout " +Checkout);
        clickOnElement(Checkout);
    }

    public String verifyWelcomeSignIn() {
        Reporter.log("verify welcome sign in message"+verifyWelcomeSignIn.toString());
        CustomListeners.test.log(Status.PASS,"get text welcome sign in" +verifyWelcomeSignIn);
        return getTextFromElement(verifyWelcomeSignIn);
    }

    public void clickOnRegister() {
        Reporter.log("click on register link"+clickOnRegister.toString());
        CustomListeners.test.log(Status.PASS,"click on Register " +clickOnRegister);
        clickOnElement(clickOnRegister);
    }

    public String verifyRegisterComplete() {
        Reporter.log("verify register complete"+verifyRegisterComplete.toString());
        CustomListeners.test.log(Status.PASS,"verify text Register Complete" +verifyRegisterComplete);
        return getTextFromElement(verifyRegisterComplete);
    }

    public void clickOnContinueAfterRegisterComplete() {
        Reporter.log("click on continue after register complete"+clickOnCompleteAfterRegister.toString());
        CustomListeners.test.log(Status.PASS,"click on complete " +clickOnCompleteAfterRegister);
        clickOnElement(clickOnCompleteAfterRegister);
    }

    public String verifyShoppingCartAfterContinue() {
        Reporter.log("verify shopping cart"+verifyShoppingCartAfterContinue.toString());
        CustomListeners.test.log(Status.PASS,"verify shopping cart after continue" +verifyShoppingCartAfterContinue);
        return getTextFromElement(verifyShoppingCartAfterContinue);
    }

    public void clickOnTermsAccept() {
        Reporter.log("click on terms and condition"+termsConditionAccept.toString());
        CustomListeners.test.log(Status.PASS,"terms and condition accept " +termsConditionAccept);
        clickOnElement(termsConditionAccept);
        Reporter.log("click on check out"+clickOnCheckOut.toString());
        CustomListeners.test.log(Status.PASS,"click on chekc out" +clickOnCheckOut);
        clickOnElement(clickOnCheckOut);
    }

    public void selectShipmentType() {
        Reporter.log("select radio airship"+selectRadioAirShip.toString());
        CustomListeners.test.log(Status.PASS,"click on radio air ship " +selectRadioAirShip);
        clickOnElement(selectRadioAirShip);
        Reporter.log("click on conitinue button"+clickContinue1.toString());
        CustomListeners.test.log(Status.PASS,"click on add to cart " +addToCart);
        clickOnElement(clickContinue1);
    }

    public void selectPaymentMethod() {
        Reporter.log("select radio airship"+selectRadioAirShip.toString());
        CustomListeners.test.log(Status.PASS,"select payment method " +selectPaymentMethod);
        clickOnElement(selectPaymentMethod);
        Reporter.log("select radio airship"+selectRadioAirShip.toString());
        CustomListeners.test.log(Status.PASS,"click on payment click" +paymentClick);
        clickOnElement(paymentClick);
    }

    public void clickOnLogOut() {
        Reporter.log("click on log out"+clickLogout.toString());
        CustomListeners.test.log(Status.PASS,"click on log out " +clickLogout);
        clickOnElement(clickLogout);
    }

    public String verifyShippingMethod() {

        Reporter.log("verify shipping method"+verifyShippingMethod.toString());
        CustomListeners.test.log(Status.PASS,"verify shipping method " +verifyShippingMethod);
        return getTextFromElement(verifyShippingMethod);
    }

    public String VerifyShippingTotal() {
        Reporter.log("verify shipping total"+verifyShippingTotal.toString());
        CustomListeners.test.log(Status.PASS,"verify shipping total" +verifyShippingTotal);
        return getTextFromElement(verifyShippingTotal);
    }
}
