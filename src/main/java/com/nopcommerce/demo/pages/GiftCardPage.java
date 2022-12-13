package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class GiftCardPage extends Utility {
    By giftCardPage = By.linkText("Gift Cards");

    public String getStringGiftCardPage() {
        Reporter.log("get string from gift card page"+giftCardPage.toString());
        CustomListeners.test.log(Status.PASS,"click on giftcard Page" +giftCardPage);
        return getTextFromElement(giftCardPage);
    }

    public void clickOnGiftCardPage() {
        Reporter.log("get string from apparel page"+giftCardPage.toString());
        CustomListeners.test.log(Status.PASS,"click on gitcard Page" +giftCardPage);
        clickOnElement(giftCardPage);
    }
}
