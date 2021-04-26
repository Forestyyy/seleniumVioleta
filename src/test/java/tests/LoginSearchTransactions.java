package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import core.TestBase;
import pages.PricesPage;

public class LoginSearchTransactions extends TestBase {

    HomePage home;
    PricesPage prises;

    @Test
    public void singlePriceVerification() {
        home = new HomePage(driver());
        Assert.assertEquals(home.verifyHomePage(),true,"Unable to reach Home Page");
        home.listOfPrices();
        prises = new PricesPage(driver());
        Assert.assertEquals(prises.verifyPricePage(),true,"Unable to reach Home Page");
    }
}
