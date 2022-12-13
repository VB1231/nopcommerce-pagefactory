package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ApparelPage extends Utility {
    By apparelPage=By.linkText("Apparel");
    public String getStringApparelPage(){
        Reporter.log("get string from apparel page"+apparelPage.toString());
        CustomListeners.test.log(Status.PASS,"click on apparel Page" +apparelPage);
        return getTextFromElement(apparelPage);
    }
    public void clickOnApparel(){
        Reporter.log("click on apparel page"+apparelPage.toString());
        CustomListeners.test.log(Status.PASS,"click on apparel Page" +apparelPage);
        clickOnElement(apparelPage);
    }
}
