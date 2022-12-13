package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computerPage;
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopPage;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement selectPosition;
    @CacheLookup
    @FindBy(linkText = "Build your own computer")
    WebElement verifyTextBuild;
    @CacheLookup
    @FindBy(id="product_attribute_1")
    WebElement selectDualCore;
    @CacheLookup
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Add to cart'])[1]")
    WebElement clickAddToCart;
    @CacheLookup
    @FindBy(id="product_attribute_1")
    WebElement selectGB;
    @CacheLookup
    @FindBy(id="product_attribute_2")
    WebElement selectRAM;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement selectRadioGB;
    @CacheLookup
    @FindBy(id="product_attribute_4_9")
    WebElement selectOS;
    @CacheLookup
    @FindBy(id="product_attribute_5_12")
    WebElement selectTotalCommander;
    @CacheLookup
    @FindBy(id="add-to-cart-button-1")
    WebElement  totalPrice;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='$1,475.00']")
    WebElement verifyTotal;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyAddToCartMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeVerifyMessage;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickGoCart ;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyShoppingCart ;
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement updateQty ;
    @CacheLookup
    @FindBy(id="updatecart")
    WebElement  clickUpdate;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']/strong")
    WebElement verifyUpdateTotal ;
    @CacheLookup
    @FindBy(id="termsofservice")
    WebElement acceptTerm;
    @CacheLookup
    @FindBy(id="checkout")
    WebElement clickCheckOut;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcomeMessage ;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkOutGuest ;
    @CacheLookup
    @FindBy(id="BillingNewAddress_FirstName")
    WebElement mandatoryName;
    @CacheLookup
    @FindBy(id="BillingNewAddress_LastName")
    WebElement mandatoryLastName;
    @CacheLookup
    @FindBy(id="BillingNewAddress_Email")
    WebElement mandatoryEmail;
    @CacheLookup
    @FindBy(id="BillingNewAddress_CountryId")
    WebElement mandatoryCountry;
    @CacheLookup
    @FindBy(id="BillingNewAddress_StateProvinceId")
    WebElement mandatoryState;
    @CacheLookup
    @FindBy(id="BillingNewAddress_City")
    WebElement mandatoryCity;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement mandatoryAddress ;
    @CacheLookup
    @FindBy(id="BillingNewAddress_ZipPostalCode")
    WebElement mandatoryPostalCode;
    @CacheLookup
    @FindBy(id="BillingNewAddress_PhoneNumber")
    WebElement mandatoryPhone;
    @CacheLookup
    @FindBy(name="BillingNewAddress_PhoneNumber")
    WebElement clickContinue;
    @CacheLookup
    @FindBy(id="shippingoption_1")
    WebElement selectShippingMethod;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement clickOnContinueShip ;
    @CacheLookup
    @FindBy(id="paymentmethod_1")
    WebElement clickPaymentMethod;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement clickContinue1 ;
    @CacheLookup
    @FindBy(id="CreditCardType")
    WebElement masterCard;
    @CacheLookup
    @FindBy(id="CardholderName")
    WebElement cardName;
    @CacheLookup
    @FindBy(id="CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(id="ExpireMonth")
    WebElement cardExMonth;
    @CacheLookup
    @FindBy(id="ExpireYear")
    WebElement cardExYear;
    @CacheLookup
    @FindBy(id="CardCode")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement cardContinue ;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement verifyPaymentMethod ;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value' and contains(text(),'Next Day Air')]")
    WebElement verifyShippingMethod ;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary' and contains(text(),'$2,950.00')]")
    WebElement verifyShippingTotal ;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirm ;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement verifyThankYo ;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifyYourOrder ;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement orderConfirm ;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement verifyWelcomeToStore ;
    public String getStringComputer() {
        Reporter.log("Get text from computer page"+computerPage.toString());
        CustomListeners.test.log(Status.PASS,"get text from computer Page" +computerPage);
        return getTextFromElement(computerPage);
    }

    public void clickOnComputer() {
        Reporter.log("click on computer page"+computerPage.toString());
        CustomListeners.test.log(Status.PASS,"click on computer Page" +computerPage);
        clickOnElement(computerPage);
    }

    public void clickOnDesktop() {
        Reporter.log("click on desktop page"+desktopPage.toString());
        CustomListeners.test.log(Status.PASS,"click on desktop Page" +desktopPage);
        clickOnElement(desktopPage);
    }

    public void selectPositionZtoA() {
        Reporter.log("click on select position"+selectPosition.toString());
        CustomListeners.test.log(Status.PASS,"click on select position" +selectPosition);
        clickOnElement(selectPosition);
        Reporter.log("select from drop down"+selectPosition.toString());
        CustomListeners.test.log(Status.PASS,"select Z to A" +selectPosition);
        selectByVisibleTextFromDropDown(selectPosition, "Name: Z to A");
    }

    public void verifyPositionZTOA() {
        List<WebElement> manageBookingList = driver.findElements(By.xpath("//span[contains(text(),'Sort by')]"));
        List<String> beforeSorted = new ArrayList<String>();
        for (WebElement p : manageBookingList) {
            beforeSorted.add(p.getText());
        }
        selectByVisibleTextFromDropDown(selectPosition, "Name: Z to A");
        List<WebElement> manageBookingList1 = driver.findElements(By.xpath("//span[contains(text(),'Sort by')]"));
        List<String> afterSorted = new ArrayList<String>();
        for (WebElement q : manageBookingList) {
            afterSorted.add(q.getText());
        }
        Collections.sort(beforeSorted);
        Assert.isTrue(true, String.valueOf(beforeSorted), afterSorted);
    }

    public String verifyTextBuildComputer() throws StaleElementReferenceException {
        Reporter.log("click on add to cart"+clickAddToCart.toString());
        CustomListeners.test.log(Status.PASS,"click on Add to Cart" +clickAddToCart);
        clickOnElement(clickAddToCart);
        return getTextFromElement(verifyTextBuild);

    }

    public void addToCart() throws StaleElementReferenceException {
        Reporter.log("click on add to cart"+clickAddToCart.toString());
        CustomListeners.test.log(Status.PASS,"click on apparel Page" +clickAddToCart);
        clickOnElement(clickAddToCart);
    }

    public void selectGB() {
        Reporter.log("click on select gb"+selectGB.toString());
        CustomListeners.test.log(Status.PASS,"select GB" +selectGB);
        clickOnElement(selectGB);
        selectByIndexFromDropDown(selectGB, 1);
    }

    public void selectDualCore() {
        Reporter.log("select dual core"+selectDualCore.toString());
        CustomListeners.test.log(Status.PASS,"select dual core" +selectDualCore);
        selectByIndexFromDropDown(selectDualCore, 1);
    }

    public void selectRAM() {
        Reporter.log("select RAM"+selectRAM.toString());
        CustomListeners.test.log(Status.PASS,"select Ram" +selectRAM);
        clickOnElement(selectRAM);
        selectByIndexFromDropDown(selectRAM, 3);
    }

    public void selectRadioGb() {
        Reporter.log("select radio gb button"+selectRadioGB.toString());
        CustomListeners.test.log(Status.PASS,"select radio GB" +selectRadioGB);
        clickOnElement(selectRadioGB);
    }

    public void selectOS() {
        Reporter.log("select OS"+selectOS.toString());
        CustomListeners.test.log(Status.PASS,"click on OS" +selectOS);
        clickOnElement(selectOS);
    }

    public void setSelectTotalCommander() {
        Reporter.log("select total commander"+selectTotalCommander.toString());
        CustomListeners.test.log(Status.PASS,"click on select commander" +selectTotalCommander);
        clickOnElement(selectTotalCommander);
    }

    public String verifyTotal() {
        Reporter.log("verify total amount"+verifyTotal.toString());
        CustomListeners.test.log(Status.PASS,"verify total amount" +verifyTotal);
        return getTextFromElement(verifyTotal);
    }

    public void addToCartT() {
        Reporter.log("click on total price"+totalPrice.toString());
        CustomListeners.test.log(Status.PASS,"click on total price" +totalPrice);
        clickOnElement(totalPrice);
    }

    public String verifyAddToCartMessage() {
        Reporter.log("verify add to cart message"+verifyAddToCartMessage.toString());
        CustomListeners.test.log(Status.PASS,"verify add to cart message" +verifyAddToCartMessage);
        return getTextFromElement(verifyAddToCartMessage);
    }

    public void closeVerifyMessage() {
        Reporter.log("close on verify message"+closeVerifyMessage.toString());
        CustomListeners.test.log(Status.PASS,"click on close message" +closeVerifyMessage);
        clickOnElement(closeVerifyMessage);
    }

    public void mouseHoverShoppingCart() {
        Reporter.log("mouse hover on shopping cart"+mouseHoverShoppingCart.toString());
        CustomListeners.test.log(Status.PASS,"click on shopping cart" +mouseHoverShoppingCart);
        mouseHoverToElement(mouseHoverShoppingCart);
        Reporter.log("click on go cart"+clickGoCart.toString());
        CustomListeners.test.log(Status.PASS,"click on Go Cart" +clickGoCart);
        clickOnElement(clickGoCart);
    }

    public String verifyShoppingCart() {
        Reporter.log("verify shopping cart"+verifyShoppingCart.toString());
        CustomListeners.test.log(Status.PASS,"verify shopping cart" +verifyShoppingCart);
        return getTextFromElement(verifyShoppingCart);
    }

    public void updateQty(String qty) {
        updateQty.clear();
        Reporter.log("update qty"+updateQty.toString());
        CustomListeners.test.log(Status.PASS,"update qty" +qty);
        sendTextToElement(updateQty, qty);
        Reporter.log("click on update"+clickUpdate.toString());
        CustomListeners.test.log(Status.PASS,"click on update qty" +clickUpdate);
        clickOnElement(clickUpdate);
    }

    public String updateTotalVerify() {
        Reporter.log("click on update"+clickUpdate.toString());
        CustomListeners.test.log(Status.PASS,"click on update" +clickUpdate);
        clickOnElement(clickUpdate);
        Reporter.log("verify update total"+verifyUpdateTotal.toString());
        CustomListeners.test.log(Status.PASS,"get text from verify update qty" +verifyUpdateTotal);
        return getTextFromElement(verifyUpdateTotal);
    }

    public void clickOnCheckOut() {
        Reporter.log("accept terms and condition"+acceptTerm.toString());
        CustomListeners.test.log(Status.PASS,"click on acceptTerm" +acceptTerm);
        clickOnElement(acceptTerm);
        Reporter.log("click on Check Out"+clickCheckOut.toString());
        CustomListeners.test.log(Status.PASS,"click on check out " +clickCheckOut);
        clickOnElement(clickCheckOut);
    }

    public void checkOutGuest() {
        Reporter.log("check out as  guest"+checkOutGuest.toString());
        CustomListeners.test.log(Status.PASS,"click on check out guest " +checkOutGuest);
        clickOnElement(checkOutGuest);
    }

    public String verifyWelcomeMessage() {
        Reporter.log("verify welcome message"+verifyWelcomeMessage.toString());
        CustomListeners.test.log(Status.PASS,"get text from welcome message" +verifyWelcomeMessage);
        return getTextFromElement(verifyWelcomeMessage);
    }

    public void fillAllMandatoryField() {
        mandatoryName.clear();
        Reporter.log("Mandatory name "+mandatoryName.toString());
        CustomListeners.test.log(Status.PASS,"set name " +mandatoryName);
        sendTextToElement(mandatoryName, "viral");
        Reporter.log("Mandatory  LAst name "+mandatoryLastName.toString());
        CustomListeners.test.log(Status.PASS,"Last name " +mandatoryLastName);
        sendTextToElement(mandatoryLastName, "brahmbhatt");
        mandatoryEmail.clear();
        Reporter.log("Mandatory Email "+mandatoryEmail.toString());
        CustomListeners.test.log(Status.PASS,"Enter Email" +mandatoryEmail);
        sendTextToElement(mandatoryEmail, randomEmail());
        Reporter.log("Mandatory Country"+mandatoryCountry.toString());
        CustomListeners.test.log(Status.PASS,"set Country " +mandatoryCountry);
        selectByIndexFromDropDown(mandatoryCountry, 1);
        Reporter.log("Mandatory State "+mandatoryState.toString());
        CustomListeners.test.log(Status.PASS,"set State" +mandatoryState);
        selectByVisibleTextFromDropDown(mandatoryState, "AA (Armed Forces Americas)");
        Reporter.log("Mandatory City "+mandatoryCity.toString());
        CustomListeners.test.log(Status.PASS,"set City " +mandatoryCity);
        sendTextToElement(mandatoryCity, "London");
        Reporter.log("Mandatory Address"+mandatoryAddress.toString());
        CustomListeners.test.log(Status.PASS,"set Address " +mandatoryAddress);
        sendTextToElement(mandatoryAddress, "14 The Avenue");
        Reporter.log("Mandatory Postal Code"+mandatoryPostalCode.toString());
        CustomListeners.test.log(Status.PASS,"set Postal Code" +mandatoryPostalCode);
        sendTextToElement(mandatoryPostalCode, "WD23 7AB");
        Reporter.log("Mandatory Phone number "+mandatoryPhone.toString());
        CustomListeners.test.log(Status.PASS,"set Phone number " +mandatoryPhone);
        sendTextToElement(mandatoryPhone, "01245666");
        Reporter.log("Click on continue "+clickContinue.toString());
        CustomListeners.test.log(Status.PASS,"click on continue " +clickContinue);
        clickOnElement(clickContinue);
    }

    public void clickOnShippingMethod() {
        Reporter.log("select shipping method"+selectShippingMethod.toString());
        CustomListeners.test.log(Status.PASS,"select shipping method" +selectShippingMethod);
        clickOnElement(selectShippingMethod);
        Reporter.log("click on continue ship"+clickOnContinueShip.toString());
        CustomListeners.test.log(Status.PASS,"click on continue ship" +clickOnContinueShip);
        clickOnElement(clickOnContinueShip);
    }

    public void clickPaymentMethod() {
        Reporter.log("click on payment method"+clickPaymentMethod.toString());
        CustomListeners.test.log(Status.PASS,"click payment method" +clickPaymentMethod);
        clickOnElement(clickPaymentMethod);
        Reporter.log("click on continue"+clickContinue1.toString());
        CustomListeners.test.log(Status.PASS,"click on continue" +clickContinue1);
        clickOnElement(clickContinue1);
    }

    public void fillCardDetail(String s) {
        Reporter.log("select mastercard"+masterCard.toString());
        CustomListeners.test.log(Status.PASS,"select mastercard" +masterCard);
        selectByVisibleTextFromDropDown(masterCard, s);
        Reporter.log("enter card holder"+cardName.toString());
        CustomListeners.test.log(Status.PASS,"select card holder name" +cardName);
        sendTextToElement(cardName, "Viral Brahm");
        Reporter.log("enter card number"+cardNumber.toString());
        CustomListeners.test.log(Status.PASS,"enter card number" +cardNumber);
        sendTextToElement(cardNumber, "1234 4564 2521 123");
        Reporter.log("enter card exp month"+cardExMonth.toString());
        CustomListeners.test.log(Status.PASS,"select mastercard expiry month" +cardExMonth);
        selectByIndexFromDropDown(cardExMonth, 3);
        Reporter.log("enter card exp year"+cardExYear.toString());
        CustomListeners.test.log(Status.PASS,"enter expiry Year" +cardExYear);
        selectByIndexFromDropDown(cardExYear, 3);
        Reporter.log("enter card code"+cardCode.toString());
        CustomListeners.test.log(Status.PASS,"select card code" +cardCode);
        sendTextToElement(cardCode, "123");
        Reporter.log("click on continue"+cardContinue.toString());
        CustomListeners.test.log(Status.PASS,"click on continue" +cardContinue);
        clickOnElement(cardContinue);

    }

    public String VerifyShippingMethod() {
        Reporter.log("verify shipping method"+verifyShippingMethod.toString());
        CustomListeners.test.log(Status.PASS,"verify shipping method" +verifyShippingMethod);
        return getTextFromElement(verifyShippingMethod);
    }

    public String verifyPaymentMethod() {
        Reporter.log("verify payment method"+verifyPaymentMethod.toString());
        CustomListeners.test.log(Status.PASS,"verify payment method" +verifyPaymentMethod);
        return getTextFromElement(verifyPaymentMethod);
    }

    public String verifyTotalShipping() {
        Reporter.log("verify Shipping total"+verifyShippingTotal.toString());
        CustomListeners.test.log(Status.PASS,"verify shipping method" +verifyShippingMethod);
        return getTextFromElement(verifyShippingTotal);
    }

    public void clickOnConfirm() {
        Reporter.log("click on confirm "+confirm.toString());
        CustomListeners.test.log(Status.PASS,"click on confirm" +confirm);
        clickOnElement(confirm);
    }

    public String verifyThankYou() {
        Reporter.log("verify thank you message"+verifyThankYo.toString());
        CustomListeners.test.log(Status.PASS,"verify Thank you message" +verifyThankYo);
        return getTextFromElement(verifyThankYo);
    }

    public String VerifyYourOrderConfirm() {
        Reporter.log("verify your order"+verifyYourOrder.toString());
        CustomListeners.test.log(Status.PASS,"get text from verify your order" +verifyYourOrder);
        return getTextFromElement(verifyYourOrder);
    }

    public void clickCompleteConfirm() {
        Reporter.log("click on order confirm"+orderConfirm.toString());
        CustomListeners.test.log(Status.PASS,"click on confirm order" +orderConfirm);
        clickOnElement(orderConfirm);
    }

    public String verifyWelcomeToStore() {
        Reporter.log("verify welcome to store text"+verifyWelcomeToStore.toString());
        CustomListeners.test.log(Status.PASS,"verify text welcome store" +verifyWelcomeToStore);
        return getTextFromElement(verifyWelcomeToStore);
    }

}
