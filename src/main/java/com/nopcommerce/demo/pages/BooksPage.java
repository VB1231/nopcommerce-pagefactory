package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class BooksPage extends Utility {
    By booksPage = By.linkText("Books");

    public String getStringBooksPage() {
        Reporter.log("get text from books page"+booksPage.toString());
        CustomListeners.test.log(Status.PASS,"get string books Page" +booksPage);
        return getTextFromElement(booksPage);
    }

    public void clickOnBooksPage() {
        Reporter.log("click on Books Page"+booksPage.toString());
        CustomListeners.test.log(Status.PASS,"click books Page" +booksPage);
        clickOnElement(booksPage);
    }
}
