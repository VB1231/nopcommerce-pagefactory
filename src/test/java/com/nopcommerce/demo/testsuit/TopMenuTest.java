package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    ComputerPage computerPage;
    ElectronicPage electronicPage;
    ApparelPage apparelPage;
    DigitalDownLoadPage digitalDownLoadPage;
    BooksPage booksPage;
    JewelryPage jewelryPage;
    GiftCardPage giftCardsPage;
    TopMenuPage topMenuPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        computerPage=new ComputerPage();
        electronicPage = new ElectronicPage();
        apparelPage = new ApparelPage();
        digitalDownLoadPage = new DigitalDownLoadPage();
        booksPage = new BooksPage();
        jewelryPage = new JewelryPage();
        giftCardsPage = new GiftCardPage();
        topMenuPage = new TopMenuPage();

    }
    @Test(groups = {"sanity","regression"})
    public void selectTopMenu(){
        topMenuPage.topMenu("Computers");
    }

    @Test(groups={"smoke","regression"})
    public void userShouldNavigateToComputerPageSuccessfully(){
        computerPage.clickOnComputer();
        Assert.assertEquals("Computers",computerPage.getStringComputer(),"verified");
    }
    @Test(groups = {"regression"})
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        electronicPage.clickOnElectronic();
        Assert.assertEquals(electronicPage.getStringElectronic(),"Electronics","not verified");
    }
    @Test(groups="regression")
    public void userShouldNavigateToApparelPageSuccessfully(){
        apparelPage.clickOnApparel();
        Assert.assertEquals(apparelPage.getStringApparelPage(),"Apparel","Not Verified");
    }
    @Test(groups="regression")
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        digitalDownLoadPage.clickOnDigitalDownLoadPage();
        Assert.assertEquals(digitalDownLoadPage.getStringDigitalDownloadPage(),"Digital downloads","not Verified");
    }
    @Test(groups = "regression")
    public void userShouldNavigateToBooksPageSuccessfully(){
        booksPage.clickOnBooksPage();
        Assert.assertEquals(booksPage.getStringBooksPage(),"Books","not Verified");
    }
    @Test(groups = "regression")
    public void userShouldNavigateToJewelryPageSuccessfully(){
        jewelryPage.clickOnJeweleryPage();
        Assert.assertEquals(jewelryPage.getStringJeweleryPage(),"Jewelry","not verified");
    }
    @Test(groups = "regression")
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        giftCardsPage.clickOnGiftCardPage();
        Assert.assertEquals(giftCardsPage.getStringGiftCardPage(),"Gift Cards","not verified");

    }

}
