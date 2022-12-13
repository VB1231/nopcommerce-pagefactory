package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    ComputerPage computerPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        computerPage= new ComputerPage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyProductArrangeInAlphaBaticalOrder(){
        computerPage.clickOnComputer();
        computerPage.clickOnDesktop();
        computerPage.selectPositionZtoA();
        computerPage.verifyPositionZTOA();

    }

}
