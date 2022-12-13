package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class JewelryPage extends Utility {
    By jewelleryPage = By.linkText("Jewelry");

    public String getStringJeweleryPage() {
        Reporter.log("get string from jewellery page"+jewelleryPage.toString());
        CustomListeners.test.log(Status.PASS,"click on jewellery Page" +jewelleryPage);
        return getTextFromElement(jewelleryPage);
    }

    public void clickOnJeweleryPage() {
        Reporter.log("get string from jewellery page"+jewelleryPage.toString());
        CustomListeners.test.log(Status.PASS,"click on jewellery Page" +jewelleryPage);
        clickOnElement(jewelleryPage);
    }
}
