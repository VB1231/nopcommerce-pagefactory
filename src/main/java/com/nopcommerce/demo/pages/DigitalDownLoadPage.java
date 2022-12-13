package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class DigitalDownLoadPage extends Utility {
    By digitalDownPage = By.linkText("Digital downloads");

    public String getStringDigitalDownloadPage() {
        Reporter.log("get string from digital download page"+digitalDownPage.toString());
        CustomListeners.test.log(Status.PASS,"click on digital download Page" +digitalDownPage);
        return getTextFromElement(digitalDownPage);
    }

    public void clickOnDigitalDownLoadPage() {
        Reporter.log("click on digital download page"+digitalDownPage.toString());
        CustomListeners.test.log(Status.PASS,"click on digital download Page" +digitalDownPage);
        clickOnElement(digitalDownPage);
    }
}
